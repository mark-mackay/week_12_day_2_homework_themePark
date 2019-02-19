import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

	private String name;
	private ArrayList<IReviewed> allRidesAndStalls;
	private ArrayList<IReviewed> ratingsList;


	public ThemePark(String name) {
		this.name = name;
		this.ratingsList = new ArrayList<>();
		this.allRidesAndStalls = new ArrayList<>();

	}

	public String getName() {
		return this.name;
	}

	public int countRatingsInArray(){
		return ratingsList.size();
	}

	public void addRatingToArray(IReviewed review){
		ratingsList.add(review);
	}
	public void addRidesAndStalls(IReviewed thingToAdd){
		this.allRidesAndStalls.add(thingToAdd);
	}

}
