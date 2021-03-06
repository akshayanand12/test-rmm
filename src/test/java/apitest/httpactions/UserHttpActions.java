package apitest.httpactions;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;



public class UserHttpActions {
	
    private final String url;

    public  UserHttpActions()
    {

        url = "http://127.0.0.1:8081/api/users";
    }

    public HttpResponse<String> addUser(JSONObject createUserJsonData) throws UnirestException {
        HttpResponse<String> response;
        response = Unirest.post(url).body(createUserJsonData.toString())
                .asString();
        return response;
    }

	public HttpResponse<String> getUsers() throws UnirestException {
		
		 HttpResponse<String> response;
	        response = Unirest.get(url).asString();
	        return response;
	}
}