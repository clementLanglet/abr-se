
public class ABR {

	private ABR fg; //le fils gauche
	private ABR fd; //le fils droit
	private int key; //la clé
	
	public void ABR(int cle, ABR gauche, ABR droit){
		key = cle;
		fg = gauche;
		fd = droit;
	}
	
	public int getKey(){
		return key;
	}
	
	public ABR getFg(){
		return fg;
	}
	
	public ABR getFd(){
		return fd;
	}
	
	public 
}
