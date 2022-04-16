package uz.epam.balltask.service;

import uz.epam.balltask.entity.Ball;
import uz.epam.balltask.entity.Basket;

public class BallService implements BallServiceImpl {


    @Override
    public int findWightOfBallsInBasket(Basket basket) {
        int weight = 0;
        int basketSize = basket.getBallList().size();

        for (int i = 0; i < basketSize; i++) {
            weight += basket.getBallList().get(i).getWeight();
        }
        return weight;
    }

    @Override
    public int amountColoredBalls(Basket basket, String colour) {
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
