import entities.GitHub;
import entities.Owner;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ApiAutomationScenario extends BaseClass {

    @Test
    public void verifyApiData() throws IOException, ClassNotFoundException  {

        HttpGet get = new HttpGet(BASE_ENDPOINT);
        response = client.execute(get);

        String data_Login = TestDataReader.login;
        int data_Id = Integer.valueOf(TestDataReader.id);
        String data_Node_Id = TestDataReader.nodeId;
        String data_Owner_Node_Id = TestDataReader.ownerNodeId;

        List<GitHub> gitHubList = ResponseUtils.unmarshallGeneric(response,GitHub.class);

        GitHub gitHub = null;
        for (int i = 0; i < gitHubList.size(); i++) {
            gitHub = gitHubList.get(i);
            int id = gitHub.getId();
            if (data_Id == id)
            {
                String nodeId = gitHub.getNodeId();
                String login = gitHub.getOwner().getLogin();
                String owner_Node_Id = gitHub.getOwner().getNodeId();

                assertEquals(nodeId, data_Node_Id);
                assertEquals(login, data_Login);
                assertEquals(owner_Node_Id, data_Owner_Node_Id);
            }
        }
    }
}
