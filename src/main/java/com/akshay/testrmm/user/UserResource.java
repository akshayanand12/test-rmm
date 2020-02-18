package com.akshay.testrmm.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
//import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.akshay.testrmm.Configuration;

@RestController
public class UserResource {
	@Autowired
	private UserDAOService service;
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/users/page-size")
	public Integer retrievePageSize() {
		return configuration.getPageSize();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable Integer id) {
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id-" + id);
		}
		
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		
		URI uri = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		User user = service.deleteById(id);
		
		if(user == null) {
			throw new UserNotFoundException("id-" + id);
		}
	}
}
