package uz.epam.balltask.service;

import uz.epam.balltask.entity.Ball;

public class DataReader {



    public DataReader() {
    }


    public boolean validateOfBalls(String line) throws NumberFormatException {
        String[] validate = line.split(" ");

        String checkColour = validate[0];
        String checkWeigh = validate[1];

//        THROW NUMBER FORMAT EXP
        int number = Integer.valueOf(checkWeigh);

        if ((checkColour instanceof String) && (number > 0)) {
            return true;
        }

        return false;
    }

    public Ball addBallCheckedLine(String line) {
        Ball ball = new Ball();
        String[] validate = line.split("\\s");

        String checkColour = validate[0];
        String checkWeigh = validate[1];

        int number = Integer.valueOf(checkWeigh);
        ball.setColor(checkColour);
        ball.setWeight(number);
        return ball;


    }

}
