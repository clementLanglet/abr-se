import static org.junit.Assert.*;

import org.junit.Test;


public class ABRTest {

	@Test
	public void testIsEmpty() {
		ABR abr = new ABR();
		assert(abr.isEmpty());
		Node n = new Node(7);
		abr.setNode(n); 
		assertFalse(abr.isEmpty());
		assert(abr.getFg().isEmpty());
		assert(abr.getFd().isEmpty());
	}
	
	@Test
	public void testInsert(){
		ABR abr = new ABR();
		abr.insert(7);
		assert(abr.getNode().getKey() == 7);
		abr.insert(5);
		assert(abr.getFg().getNode().getKey() == 5);
		abr.insert(10);
		assert(abr.getFd().getNode().getKey() == 10);
	}

}
