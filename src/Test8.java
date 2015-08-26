import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("myNewFile.txt");
		FileWriter fw;
		FileReader fr;
		
		try {
			fw = new FileWriter(file);
			
			String str = "Bonjour les zéros.\n";
			str += "\tComment allez-vous ?\n";
			fw.write(str);
			fw.close();
			
			fr = new FileReader(file);
			str = "";
			int i = 0;
			
			//lecture
			while((i = fr.read())!= -1) {
				str += (char)i;
			}
			
			//affichage
			System.out.println(str);			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
