
public class ABR {

	private ABR fg; //le fils gauche
	private ABR fd; //le fils droit
	private Node noeud; //le noeud
	
	public ABR(){
		noeud = null;
		fg = null;
		fd = null;
	}
	
	public Node getNode(){
		return noeud;
	}
	
	public ABR getFg(){
		return fg;
	}
	
	public ABR getFd(){
		return fd;
	}
	
	public void setNode(Node n){
		noeud = n;
		fg = null;
		fd = null;
	}
	
	public void setFg(ABR gauche){
		fg = gauche;
	}
	
	public void setFd(ABR droit){
		fd = droit;
	}
		
	public boolean isEmpty(){
		return (getFg() == null && getFd() == null && getNode() == null);
	}
	
	public void insert(int a){
		Node n = new Node(a);
		if(isEmpty()){
			setNode(n);
		}
		else{
			int cle = getNode().getKey();
			ABR fg = getFg();
			ABR fd = getFd();
			if(fg == null && fd == null){
				fg.setNode(n);
			}
			else{ 
				if(a < cle){
				fg.insert(a);
				}
				else{
					fd.insert(a);;
				}
			}
		}
	}
	
}
