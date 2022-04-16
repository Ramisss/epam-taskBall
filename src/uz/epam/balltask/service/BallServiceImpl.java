package uz.epam.balltask.service;

import uz.epam.balltask.entity.Basket;

public interface BallServiceImpl {
    int findWightOfBallsInBasket(Basket basket);

    int amountColoredBalls(Basket basket, String colour);

}
