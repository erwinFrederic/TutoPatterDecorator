import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWriter sw = new StringWriter();
		StringReader sr;
		
		try {
			sw.write("Coucou les zéros");
			System.out.println(sw);
			sw.close();
			
			sr = new StringReader(sw.toString());
			String str = "";
			int i;
			
			while((i = sr.read()) != 1){
				str += (char)i;
			}
			
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
