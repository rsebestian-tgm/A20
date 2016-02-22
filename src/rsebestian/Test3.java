package rsebestian;
import org.junit.Test;
//Offenbar ist in GEWICHT ein Formatierungsfehler weil das eigengewicht nicht zum gesamtgewicht zählt.
import weiser.*;
public class Test3 {
	@Test(expected=GewichtException.class)
	public void testlast(){
		LKW johann = new LKW("J0H4NN",5000,1300,3);
		johann.aufladen(2000);
		johann.entladen(1000);
		johann.aufladen(2700);
		johann.aufladen(1);
	}
}

