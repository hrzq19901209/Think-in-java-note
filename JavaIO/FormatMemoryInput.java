import java.io.IOException;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;

public class FormatMemoryInput {
	public static void main(String[] args)throws IOException{
		try{
			DataInputStream in = new DataInputStream(
			new ByteArrayInputStream(TestReader.read("FormatMemoryInput.java").getBytes()));
			while(in.available() != 0){
				System.out.println((char)in.readByte());
			}
		}catch(EOFException e){
			e.printStackTrace();
		}
	}
}