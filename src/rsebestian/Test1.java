package rsebestian;
import org.junit.Test;

import weiser.*;
public class Test1 {
	@Test(expected=GewichtException.class)
	public void testlast(){
		LKW johann = new LKW("J0H4NN",5000,1300,3);
		johann.aufladen(2000);
		johann.entladen(1000);
		johann.aufladen(3000);
		johann.aufladen(1000);
		johann.aufladen(1);
	}
}

