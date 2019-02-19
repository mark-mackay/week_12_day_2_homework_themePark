package Stall;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitor.Visitor;

public class Tobacco extends Stall implements IReviewed, ISecurity {

    private int rating;
    public Tobacco(String name, String ownerName, String parkingSpot , int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = true;
        if (visitor.getAge() < 18){
            allowed = false;
        }
        return allowed;
    }
}
