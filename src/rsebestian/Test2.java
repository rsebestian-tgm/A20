package rsebestian;
import org.junit.Test;

import weiser.*;
public class Test2 {
	@Test(expected=PersonenException.class)
	public void testperson(){
		LKW johann = new LKW("J0H4NN",5000,1300,3);
		johann.einsteigen();
		johann.einsteigen();
		johann.einsteigen();
		johann.einsteigen();
		johann.aussteigen();
	}
}

