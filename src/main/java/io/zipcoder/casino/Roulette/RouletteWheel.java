package io.zipcoder.casino.Roulette;
import io.zipcoder.casino.utilities.Console;

import java.util.Random;

public class RouletteWheel {
    RouletteWheel wheel = new RouletteWheel();

    public static final String RED = "red";
    public static final String BLACK = "black";
    public static final String GREEN = "green";
    public static final String ODD = "odd";
    public static final String EVEN = "even";

    static int num;
    static String color;
    Random random;
    Console console;

    public RouletteWheel() {
        num = 0;
        color = null;
        random = new Random();
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getColor(){
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public static String spin(){
        Random random = new Random();
        num = random.nextInt(36)+1;
        color = (random.nextInt(1)==0) ? RED : BLACK;
        return num + " " + color;
    }

    public static String getOddEven() {
        if (spin().equals(RED)) {
            return ODD;
        } else {
            return EVEN;
        }
    }

    public void display(){
        console.println(wheel.spin().toString() + " " + wheel.getOddEven().toString());
    }
}
