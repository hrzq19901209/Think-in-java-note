import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileT{
	static String file = "b.dat";
	public static void display() throws IOException{
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		for(int i = 0;i < 7;i++){
			System.out.println(i+" : "+raf.readInt());
		}
		System.out.println(raf.readUTF());
		raf.close();
	}
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		for(int i = 0;i < 7;i++){
			raf.writeInt(i+1);
		}
		raf.writeUTF("ÎÒ°®Äã");
		raf.close();
		display();
		raf = new RandomAccessFile(file,"rw");
		raf.seek(0);
		raf.writeInt(8);
		raf.close();
		display();
	}
}