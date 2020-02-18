package apitest.tests;

import apitest.httpactions.UserHttpActions;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTests {

    private UserHttpActions userHttpActions;
    JSONParser jsonParser;
    private JSONObject createUserJsonData;
    private Path path;

    public UserTests() throws IOException, ParseException {
        userHttpActions = new UserHttpActions();
        path = FileSystems.getDefault().getPath(".").toAbsolutePath();
        String dataPath=path+"/src/test/java/apitest/data/";
        FileReader reader = new FileReader(dataPath+"createUserData.json");
        jsonParser = new JSONParser();
        createUserJsonData = (JSONObject) jsonParser.parse(reader);

    }

    @Test
    public void verifyUserCreate() throws UnirestException, IOException, ParseException {
//        HttpResponse<String> responseData = userHttpActions.addUser(createUserJsonData);
//        assertThat(responseData.getStatus()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void verifyUserCreateWithInvalidData()
    {

    }

    @Test
    public void verifyUserGet() throws UnirestException
    {
//    	HttpResponse<String> responseData = userHttpActions.getUsers();
//        assertThat(responseData.getStatus()).isEqualTo(HttpStatus.OK.value());
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
