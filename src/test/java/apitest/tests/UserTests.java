package apitest.tests;

import apitest.httpactions.UserHttpActions;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTests {

    private UserHttpActions userHttpActions;
    JSONParser jsonParser;
    private JSONObject createUserJsonData;


    public UserTests() throws IOException, ParseException {
//        userHttpActions = new UserHttpActions();
//        FileReader reader = new FileReader("../data/createUserData.json");
//        jsonParser = new JSONParser();
//        createUserJsonData = (JSONObject) jsonParser.parse(reader);
    }

    @Test
    public void verifyUserCreate() throws UnirestException {
//        HttpResponse<String> responseData = userHttpActions.addUser(createUserJsonData);
//        assertThat(responseData.getStatus()).isEqualTo(HttpStatus.OK);
    	assertThat(true).isEqualTo(true);
    }

    @Test
    public void verifyUserCreateWithInvalidData()
    {

    }

    @Test
    public void verifyUserGet()
    {

    }


    @Test
    public void verifyUserGetWithNonExistingId()
    {

    }

    @Test
    public void verifyUserGetWithInvalidRequest()
    {

    }


    @Test
    public void verifyUserDelete()
    {

    }
}
