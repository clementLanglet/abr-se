
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
		return (getNode() == null);
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
			if(a < cle){
				fg.insert(a);
			}
			else{
				if(cle <a){
					fd.insert(a);
				}
			}
		}
	}

	public int nbElement(){
		if(isEmpty()){
			return 0;
		}
		else{
			ABR fg = getFg();
			ABR fd = getFd();
			return(1+fg.nbElement()+fd.nbElement());
		}
	}

	public boolean contains(int a){
		if(!isEmpty()){
			int cle = getNode().getKey();
			if(a == cle){
				return true;
			}
			else{
				if(a < cle){
					ABR fg = getFg();
					fg.contains(a);
				}
				else{
					if(cle < a){
						ABR fd = getFd();
						fd.contains(a);
					}
				}
			}
		}
		return false;
	}

	public void toList(java.util.List<java.lang.Integer> l){
		if(!isEmpty()){
				int cle = getNode().getKey();
				l.add(cle);
				getFg().toList(l);
				getFd().toList(l);
		}
	}
}


