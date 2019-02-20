import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

	protected String name;
	private ArrayList<IReviewed> allRidesAndStalls;


	public ThemePark(String name) {
		this.name = name;
		this.allRidesAndStalls = new ArrayList<>();

	}

	public String getName() {
		return this.name;
	}

	public int countRatingsInArray(){
		return allRidesAndStalls.size();
	}

	public void addRideOrStall(IReviewed rideOrStall){
		this.allRidesAndStalls.add(rideOrStall);
	}

	public ArrayList getRatings(){
		return this.allRidesAndStalls;
	}
	public void outputAllNamesAndRatings(){
		for (IReviewed rating : allRidesAndStalls){
			System.out.println("Ride Name: " + rating.getName() + "\nRating: " + rating.getRating());
		}
	}


}
