package pgmC1.sJSON;
import java.io.FileReader;	

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReJSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(".\\JSON\\student.json");

        Object obj = jsonparser.parse(reader);
        JSONObject studentobj = (JSONObject) obj;

        String first = (String) studentobj.get("first");
        String last = (String) studentobj.get("last");

        System.out.println("Firstname: " + first);
        System.out.println("Lastname: " + last);
    }
}
