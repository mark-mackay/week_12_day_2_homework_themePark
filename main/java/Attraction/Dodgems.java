package Attraction;

import Interfaces.IReviewed;

public class Dodgems extends Attraction implements IReviewed {
        private int rating;

        public Dodgems(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public int getRating() {
            return rating;
        }
}
