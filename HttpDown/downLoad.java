import java.io.StringBuffer;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class downLoad{
	private URL url = null;
	//下载文本
	public String downLoadTxt(String urlStr){
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferReader buffer = null;
		try{
			//创建URL对象
			url = new URL(urlStr);
			//创建HTTP连接
			HttpURLConnection conn = (HttpURLConnection)conn.openConnection();
			//读取数据
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