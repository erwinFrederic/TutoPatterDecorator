import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis;
		BufferedInputStream bis;
		FileChannel fc;
		
		try {
			fis = new FileInputStream(new File("testAgain.txt"));
			bis = new BufferedInputStream(fis);
			
			long time = System.currentTimeMillis();
			
			while(bis.read() != -1){
				System.out.println("Temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));
				
			}
			
			//creation d'un flux de fichier
			fis = new FileInputStream(new File("testAgain.txt"));
			fc = fis.getChannel();
			int size = (int)fc.size();
			ByteBuffer bBuff = ByteBuffer.allocate(size);
			
			time = System.currentTimeMillis();
			
			fc.read(bBuff);
			
			System.out.println("Temps d'exécution avec un buffer nio : " + (System.currentTimeMillis() - time));
			
			byte[] tabByte = bBuff.array();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
