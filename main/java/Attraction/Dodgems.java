package Attraction;

import Interfaces.IReviewed;

public class Dodgems extends Attraction implements IReviewed {
        private int rating;
        protected String name;
        public Dodgems(String name, int rating) {
            super(name);
            this.name = name;
            this.rating = rating;
        }

        @Override
        public int getRating() {
            return rating;
        }
        @Override
            public String getName() {
            return this.name;
        }
}
