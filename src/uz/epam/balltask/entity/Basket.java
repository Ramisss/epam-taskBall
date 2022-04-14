package uz.epam.balltask.entity;

import java.util.List;
import java.util.StringJoiner;

public class Basket {

   private List<Ball> ballList;



    public Basket(List<Ball> ballList) {
        this.ballList = ballList;
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public void setBallList(List<Ball> ballList) {
        this.ballList = ballList;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("ballList=" + ballList)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        return ballList.equals(basket.ballList);
    }

    @Override
    public int hashCode() {
        return ballList.hashCode();
    }
}
