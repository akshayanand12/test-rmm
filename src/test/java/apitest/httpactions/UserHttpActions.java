package apitest.httpactions;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;



public class UserHttpActions {
	
    private final String url;

    public  UserHttpActions()
    {

        url = "http://172.16.93.1:8081/api/users";
    }

    public HttpResponse<String> addUser(JSONObject createUserJsonData) throws UnirestException {
        HttpResponse<String> response;
        response = Unirest.post(url).body(createUserJsonData)
                .asString();
        return response;
    }
}