import java.io.File;
import java.io.FilenameFilter;
public class FileTest{
	public static void main(String[] args){
		File file = new File(".");
		try{
			String[] files = file.list(new FilenameFilter(){
				@Override
				public boolean accept(File dir,String name){
					String f = new File(name).getName();
					return f.indexOf("wo") != -1;
				}
			});
			for(int i = 0;i <  files.length;i++){
				System.out.println(files[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}