package uz.epam.service;

import uz.epam.entity.Basket;

public class BallService {

    public static int findWightOfBallsInBasket(Basket basket) {

        int weight = 0;
        int basketSize = basket.getBallList().size();

        for (int i = 0; i < basketSize; i++) {
            weight += basket.getBallList().get(i).getWeight();
        }
        return weight;
    }

    public static int amountColoredBalls(Basket basket, String colour) {

        int amount = 0;
        int basketSize = basket.getBallList().size();

        for (int i = 0; i < basketSize; i++) {
            if (basket.getBallList().get(i).getColor().equals(colour)) {
                amount++;
            }
        }

        return amount;
    }



}
