package rsebestian;
import org.junit.Test;
//Bei 0 Personen kommt die PersonenException.
import weiser.*;
public class Test4 {
	@Test(expected=PersonenException.class)
	public void testperson(){
		LKW johann = new LKW("J0H4NN",5000,1300,3);
		johann.einsteigen();
		johann.aussteigen();
	}
}

