package streams;
import java.io.IOException;
import java.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
		
		in = new FileInputStream("C:\\Users\\admin\\Desktop\\SAURAV\\JAVA\\Deloitte Core Java\\src\\IfDemo.java");
		out = new FileOutputStream("C:\\Users\\admin\\Desktop\\SAURAV\\JAVA\\Deloitte Core Java\\src\\IfDemo1.java");
		
		
		int t;
		
		while( (t=in.read()) != -1){
			System.out.print((char)t);
			out.write(t);
		}
				
		}
		catch(FileNotFoundException fnfe){
			
		}
		catch(IOException ioe){
			
		}
		finally{
			if(in != null)
				try{
					in.close();					
				}catch(IOException e){
				}
		}
		if(Objects.nonNull(out)){
			try{
				out.close();
			}catch(IOException e){
				
			}
		}
		
	}

}
