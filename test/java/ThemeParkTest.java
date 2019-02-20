import Attraction.RollerCoaster;
import Attraction.Dodgems;
import Stall.IceCream;
import Stall.Tobacco;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

	ThemePark themePark;
	RollerCoaster rollerCoaster;
	Dodgems dodgems;
	Visitor visitor;
	Visitor visitor1;
	IceCream iceCreamStall;
	Tobacco tobaccoStall;


	@Before
	public void before() {
		themePark = new ThemePark("Alton Towers");
		rollerCoaster = new RollerCoaster("Oblivion", 4);
		visitor = new Visitor("Jon", 28, 175, 40);
		visitor1 = new Visitor("MiniMe", 28, 140, 40);
		iceCreamStall = new IceCream("Joe's Ices", "Joe", "E25", 3);
		tobaccoStall = new Tobacco("Joe's Baccy", "Joe", "E26", 4);
		dodgems = new Dodgems("Marky's Dodgems", 2);

	}

//	@Test
//	public void canGetRating() {
//		assertEquals(0, themePark.getRating());
//	}


	@Test
	public void canGetName() {
		assertEquals("Alton Towers", themePark.getName());
	}

	@Test
	public void canGetRatingCount(){
		assertEquals(0, themePark.countRatingsInArray());
	}
//
//	@Test
//	public void canAddToRatingList() {
//		themePark.addRatingToArray();
//		assertEquals(1, themePark.countRatingsInArray());
//	}
	@Test
	public void testCanAddRidesAndStalls(){
		themePark.addRideOrStall(rollerCoaster);
		themePark.addRideOrStall(dodgems);
		themePark.addRideOrStall(tobaccoStall);
		themePark.addRideOrStall(iceCreamStall);
		assertEquals(4, themePark.countRatingsInArray());
	}
	@Test
	public void testThemeParkCanOutputAllRidesAndRatings(){
		themePark.addRideOrStall(rollerCoaster);
		themePark.addRideOrStall(dodgems);
		themePark.addRideOrStall(tobaccoStall);
		themePark.addRideOrStall(iceCreamStall);
		themePark.outputAllNamesAndRatings();
	}
}
