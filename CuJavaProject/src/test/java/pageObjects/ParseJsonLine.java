package pageObjects;

import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParseJsonLine {

    public String getEtd(String nameAndRole) {
        JSONParser parser = new JSONParser();
        String etdParams = null;
        try {
            Object obj = parser.parse(new FileReader("Data\\users.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String etdPath = nameAndRole + ".etdParams";
            etdParams = JsonPath.read(jsonObject, etdPath);
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
        catch (Exception e) { e.printStackTrace(); }

        return (etdParams);
    }

    public String parseJson(String pathXpath) {
        JSONParser parser = new JSONParser();
        String xpath = null;
        try {
            Object obj = parser.parse(new FileReader("Data\\xpath-source.json"));
            JSONObject jsonObject = (JSONObject) obj;
            xpath = JsonPath.read(jsonObject, pathXpath);
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
        catch (Exception e) { e.printStackTrace(); }

        return (xpath);
    }
}