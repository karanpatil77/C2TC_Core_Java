package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class test2 {
	public static void main(String[]args) 
	throws FileNotFoundException{
		String filename="C:\\Users\\KARAN\\Desktop\\q.txt";
			File myfile = new File(filename);
			if(myfile.exists())
			{
			     System.out.println("File exists.");
			}
			else{
				System.out.println("File not exists.");
			}
			FileInputStream fi = new FileInputStream(myfile);
			try {
				int i=0;
				while((i=fi.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try {
					fi.close();
				}
				catch(Exception e) 
				{
					e.printStackTrace();
			}}}
}
