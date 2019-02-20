package Attraction;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitor.Visitor;


public class RollerCoaster extends Attraction implements ISecurity, IReviewed {
	private int rating;
	protected String name;
	public RollerCoaster(String name, int rating) {
		super(name);
		this.rating = rating;
	}

	public boolean isAllowedTo(Visitor visitor){
		boolean allowed = true;
		if (visitor.getAge() < 13 || visitor.getHeight() < 146){
			allowed = false;
		}
		return allowed;
	}

	@Override
	public int getRating() {
		return rating;
	}
	@Override
	public String getName() {
		return name;
	}
}
