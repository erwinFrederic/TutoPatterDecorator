import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {
	
	public static void main (String[] args) {
		//déclaration des variables
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		
		try {
			//instancition des variables
			fis = new FileInputStream(new File("dictionnaire.txt"));
			fos = new FileOutputStream(new File("dicoCopy.txt"));
			bis = new BufferedInputStream(fis);
			
			//creation du buffer
			byte[] buf = new byte[8];
			
			//Gestion du temps phase un -> récupération de l'heure avant opération
			long startTime = System.currentTimeMillis();
			
			while((bis.read(buf)) != -1)
				fos.write(buf);
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("Copie réalisée en " + (endTime - startTime));
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//fermetures
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e){
					e.printStackTrace();
				}
							
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e){
					e.printStackTrace();
				}
				
			
		}
	}
}