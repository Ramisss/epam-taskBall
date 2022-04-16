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
        List<Ball> list = new ArrayList();


        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (dataReader.validateOfBall(line)) {
                    ball = dataReader.addCheckedBall(line);
                    list.add(ball);
                } else {
                    System.out.println("Wrong data type");
                    System.err.println(line);
                    break;
                }
                basket.setBallList(list);



            }
            System.out.println(ballService.amountColoredBalls(basket, "red"));
//            System.out.println("\n");
            System.out.println(ballService.findWightOfBallsInBasket(basket));


        }
    }
}
