package Stall;

import Interfaces.IReviewed;

public class IceCream extends Stall implements IReviewed {
	private int rating;
	protected String name;
	public IceCream(String name, String ownerName, String parkingSpot , int rating) {
		super(name, ownerName, parkingSpot);
		this.name = name;
		this.rating = rating;
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
