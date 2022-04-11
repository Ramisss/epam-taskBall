package uz.epam.entity;

import java.util.StringJoiner;

public class Ball {

    private int weight;
    private String color;

    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (weight != ball.weight) return false;
        return color.equals(ball.color);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .add("color='" + color + "'")
                .toString();
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + color.hashCode();
        return result;
    }
}
