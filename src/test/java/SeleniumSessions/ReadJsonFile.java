package SeleniumSessions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

JSONParser jsonparser = new JSONParser();
JSONObject jsonobject = (JSONObject) jsonparser.parse(new FileReader("D:\\8D_Sharan\\crunchify.json"));

String Cname = (String) jsonobject.get("Name") ;
String Cauthour = (String) jsonobject.get("Author") ;
String Ccompany = (String) jsonobject.get("Compnay") ;
String Ccountry = (String) jsonobject.get("Country") ;

System.out.println(Cname);
System.out.println(Cauthour);
System.out.println(Ccompany);
System.out.println(Ccountry);


	}

}
