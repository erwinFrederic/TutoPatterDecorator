import java.io.Serializable;

public class Game implements Serializable {
	private String nom, style;
	private double prix;
	private transient Notice notice;
	
	public Game(String pNom, String pStyle, double pPrix){
		this.nom = pNom;
		this.style = pStyle;
		this.prix = pPrix;
		this.notice = new Notice();
	}
	
	public String toString(){
		return("Nom du jeu: " + this.nom + "\nStyle de jeu: " + this.style + "\nPrix du jeu: " + this.prix + "\n");
	}
}
