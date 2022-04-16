package uz.epam;

import uz.epam.balltask.entity.Ball;
import uz.epam.balltask.entity.Basket;
import uz.epam.balltask.service.BallService;
import uz.epam.balltask.service.DataReader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/resources/ballTest.txt");
        DataReader dataReader = new DataReader();
        BallService ballService = new BallService();
        Ball ball;
        Basket basket = new Basket();


        try (Scanner scanner = new Scanner(path)) {
            List<Ball> list = new ArrayList();

            while (scanner.hasNextLine()) {
                if (dataReader.validateOfBalls(scanner.nextLine())) {
                    ball = dataReader.addBallCheckedLine(scanner.nextLine());
                    list.add(ball);
                } else {
                    System.out.println("Wrong data type");
                    break;
                }
            }
            basket.setBallList(list);
            System.out.println(ballService.amountColoredBalls(basket, "red"));
            System.out.println(ballService.findWightOfBallsInBasket(basket));


        }


    }
}
