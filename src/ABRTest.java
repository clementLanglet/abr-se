import static org.junit.Assert.*;

import java.util.List;

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
	
	@Test
	public void testContains(){
		ABR abr = new ABR();
		assertFalse(abr.contains(10));
		abr.insert(7);
		assert(abr.contains(7));
		abr.insert(10);
		assert(abr.contains(10));
		abr.insert(5);
		assert(abr.contains(5));
	}
	
	/*@Test
	public void testToList(){
		ABR abr = new ABR();
		List<Integer> l = new List<Integer>();
		assert(abr.toList(l) );
	}*/

}
