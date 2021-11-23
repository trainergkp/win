import java.io.*;

public class OldFile {

	public static void main(String[] args) {
		try 
		{
			FileReader fr=new FileReader("abc.txt");
			int r=0;
			System.out.println("Content of file");
			System.out.println("............................");
			while((r=fr.read())!=-1)
			{
				System.out.print((char)r);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
