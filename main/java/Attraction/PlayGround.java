package Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitor.Visitor;

public class PlayGround extends Attraction implements ISecurity, IReviewed {
    private int rating;
    public PlayGround(String name, int rating) {
        super(name);
        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = true;
        if (visitor.getAge() > 15){
            allowed = false;
        }
        return allowed;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
