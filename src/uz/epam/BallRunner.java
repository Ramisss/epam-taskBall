package uz.epam;

import uz.epam.balltask.entity.Ball;
import uz.epam.balltask.entity.Basket;
import uz.epam.balltask.service.BallService;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallRunner {



    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/resources/ballTest.txt");


        List<Ball> addToList = new ArrayList<>();
        Basket basket = new Basket(addToList);

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String colour = scanner.next();
                Integer integer = scanner.nextInt();

                if ((integer instanceof Integer) && (colour instanceof String)) {
                    addToList.add(new Ball(integer, colour));
                }
            }
        }





        System.out.println(BallService.findWightOfBallsInBasket(basket));
        System.out.println(BallService.amountColoredBalls(basket, "red"));


    }
}
