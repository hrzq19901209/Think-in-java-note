import java.io.StringBuffer;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class downLoad{
	private URL url = null;
	//�����ı�
	public String downLoadTxt(String urlStr){
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferReader buffer = null;
		try{
			//����URL����
			url = new URL(urlStr);
			//����HTTP����
			HttpURLConnection conn = (HttpURLConnection)conn.openConnection();
			//��ȡ����
			buffer = new BufferReader(new InputStreamReader(conn.getInputStream()));
			while((line = buffer.readLine()) != null){
				sb.append(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}