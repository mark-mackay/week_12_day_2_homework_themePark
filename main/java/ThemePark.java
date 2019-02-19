import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

	private String name;
	private ArrayList<IReviewed> ratingsList;


	public ThemePark(String name) {
		this.name = name;
		this.ratingsList = new ArrayList<>();

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

}
