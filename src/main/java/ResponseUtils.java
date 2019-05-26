import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ResponseUtils {

    public static <T> List<T> unmarshallGeneric(CloseableHttpResponse response,  Class<T> clazz) throws IOException, ClassNotFoundException  {

        String jsonBody = EntityUtils.toString(response.getEntity());
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;

        Class<T[]> arrayClass = (Class<T[]>) Class.forName("[L"+clazz.getName()+";");
        T[] objects = mapper.readValue(jsonBody, arrayClass);

        return Arrays.asList(objects);
    }
}
