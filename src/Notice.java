
public class Notice {
	private String langue;
	
	public Notice(){
		this.langue = "anglais";
	}
	
	public Notice(String pLangue){
		this.langue = pLangue;
	}
	
	public String toString() {
		return("\t Langue de la notice: " + this.langue + "\n" );
	}
}
