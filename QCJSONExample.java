package qcjson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;


public class QCJSONExample
{

	
	public static void main(String[] args)
	{
        
        try {
			FileOutputStream fout = new FileOutputStream("SomeFileName.someExtension");
			FileInputStream fin = new FileInputStream("SomeFileName.someExtension");
			
			JSONOutputStream jsonOut = new JSONOutputStream(fout);
			JSONInputStream jsonIn = new JSONInputStream(fin);

			Date sampleDate = new Date();
			TestObject anObject = new TestObject("sample string", 41588, sampleDate);
			
			jsonOut.writeObject(anObject);
			
			//since I wrote out an object I get a HashMap back.
			HashMap parsedJSONMap = (HashMap) jsonIn.readObject();
			TestObject readObject = new TestObject(parsedJSONMap);
			System.out.println("stream same? "+readObject.equals(anObject));
			
			
			String jsonString = JSONUtilities.stringify(anObject);
			System.out.println("JSON: "+jsonString);
			
			parsedJSONMap = (HashMap)JSONUtilities.parse(jsonString);
			readObject = new TestObject(parsedJSONMap);
			System.out.println("stringify same? "+readObject.equals(anObject));
			
		} catch (JSONException e)
        { 
			e.printStackTrace();
		} catch (FileNotFoundException e)
        {
			e.printStackTrace();
		}
        
        
    }
}