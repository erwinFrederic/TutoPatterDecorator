import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis;
		DataOutputStream dos;
		
		try {
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("sdz.txt"))));
			
			dos.writeBoolean(true);
			dos.writeByte(100);
			dos.writeChar('c');
			dos.writeDouble(12.40);
			dos.close();
			
			//récupération des données
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("sdz.txt"))));
			
			System.out.println(dis.readDouble());
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
