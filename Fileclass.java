package writefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileclass 
{
void get()throws IOException
{
	File file = new File("srushti.txt");
	FileWriter fileWritter = new FileWriter(file);
	fileWritter.write("hello");
	fileWritter.close();
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fileclass fileclassobj = new Fileclass();
		fileclassobj.get();
	}

}
