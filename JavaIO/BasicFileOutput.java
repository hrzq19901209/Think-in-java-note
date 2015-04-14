import java.io.IOException;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BasicFileOutput{
	public static void main(String[] args) throws IOException{
		final String file = "aaa.out";
		BufferedReader in = new BufferedReader(
		new StringReader(TestReader.read("BasicFileOutput.java")));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		String line = null;
		int countLine = 1;
		while((line = in.readLine()) != null){
			pw.println(countLine++ +": "+line);
		}
		pw.close();
		System.out.println(TestReader.read(file));
	}
}