//package � importer
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//d�claration des fichiers or du block try {} catch {}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//instanciation des objets
			//fis va lire le fichier
			//fos va �crire dans le nouveau fichier
			fis = new FileInputStream(new File("text.txt"));
			fos = new FileOutputStream(new File("text2.txt"));
			
			//creation d'un tableau de byte pour indiquer le nbre de bytes lu � chaque tour de boucle
			byte[] buff = new byte[8];
			
			//on cr��e une variable de type int pour y affecter le r�sultat de la lecture. Vaut -1 quand c'est fini
			int n = 0;
			
			//tant que l'affectation dans la variable n est possible, on fait tourner la boucle
			//lorsque la lecture du fichier est termin�e, l'affectation n'est plus possible
			//On sort de la boucle
			while ((n = fis.read(buff)) >= 0) {
				//on �crit dans le deuxi�me fichier avec l'objet adequat
				fos.write(buff);
				//on affiche ce qu'a lu notre boucle au format byte et au format char
				for(byte bit : buff) {
					System.out.println("\t" + bit + "(" + (char)bit + ")" );
					System.out.println("");
				}
				
			}
			
			System.out.println("Copie termin�e");
			
		} catch (FileNotFoundException e) {
			//exception lev�e si on ne trouve pas le fichier
			e.printStackTrace();
		} catch (IOException e) {
			//exception lev� si on ne peut pas lire ou �crire dans le fichier
			e.printStackTrace();
		} finally {
			//on ferme les flux quelque soit ce qui se passe plus haut
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
