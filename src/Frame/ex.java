package Frame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class ex {
public ex() 
{
/*	
	try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("Username.txt"), "utf-8"))) {
 writer.write("something");
}
	catch(UnsupportedEncodingException e)
	{
		System.out.println(e.getMessage());
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e.getMessage());
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	*/
	 // The name of the file to open.
  /*  String fileName = "filename.txt";

    // This will reference one line at a time
    String line = null;

    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader = 
            new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }   

        // Always close files.
        bufferedReader.close();         
    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
        // Or we could just do this: 
        // ex.printStackTrace();
    }*/
    appendTextFile("\ndadadd");
}
public static void main(String[] args) {
	new ex();
}
public void appendTextFile(String text) {     
	File file = new File("filename.txt");
	if (!file.exists()) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
  
	try {
		BufferedWriter buf = new BufferedWriter(new FileWriter(file, true)); 
		buf.append(text);
		buf.newLine();
		buf.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
