import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration des objets
		ObjectOutputStream oos;
		ObjectInputStream ois;
		
		try {
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream( 
							new FileOutputStream( 
									new File("allmygames.txt"))));
			
			//création des objets 3
			oos.writeObject(new Game("Assassin creed", "Aventure", 10.90));
			oos.writeObject(new Game("Metroid Fusion", "Aventure", 5.05));
			oos.writeObject(new Game("The Legend of Zelda", "Aventure/Medieval", 7.98));
			
			//fermeture
			oos.close();
			
			//déclaration de l'ois et lecture
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream( 
									new File("allmygames.txt"))));
			
			try {
				
				System.out.println("Affichage des jeux");
				System.out.println("******************\n");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
