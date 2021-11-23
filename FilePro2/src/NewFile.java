import java.io.*;

public class NewFile {

	public static void main(String[] args) {
		try 
		{
			FileWriter fw=new FileWriter("abc.txt",true);
			String str="Bond with best";
			char [] ch=("\n"+str).toCharArray();
			fw.write(ch);
			fw.close();
			System.out.println("File saved");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}

}
