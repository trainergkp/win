import java.io.*;

public class OldFile2 {

	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr=new FileReader("abc.txt");
			BufferedReader br=new BufferedReader(fr);
			String str="";
			System.out.println("Content of file");
			System.out.println("............................");
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			fr.close();
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
