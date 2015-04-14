import java.io.*;

public class StoreAndRecoverData{
	public static void main(String[] args) throws IOException{
		final String file = "aaa.out";
		DataOutputStream out = new DataOutputStream(
		new BufferedOutputStream(new FileOutputStream(file)));
		out.writeUTF("ÎÒ°®Äã");
		out.writeDouble(2.56);
		out.close();
		DataInputStream in = new DataInputStream(
		new BufferedInputStream(new FileInputStream(file)));
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
	}
}