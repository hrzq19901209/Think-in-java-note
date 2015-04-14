import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReader{
	public static String read(String fileName)throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		StringBuffer sb = new StringBuffer();
		String line = null;
		while((line = in.readLine()) != null){
			sb.append(line+"\n");
		}
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException{
		System.out.println(read("TestReader.java"));
	}
}