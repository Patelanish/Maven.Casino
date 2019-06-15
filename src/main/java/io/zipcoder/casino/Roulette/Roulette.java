package io.zipcoder.casino.Roulette;
import java.util.Random;

import io.zipcoder.casino.utilities.BasePlayer;
import io.zipcoder.casino.utilities.Console;
import io.zipcoder.casino.utilities.GamblingGame;

public class Roulette implements GamblingGame {

    //Players and numbers.
    private Random random;
    private BasePlayer base;
    private BasePlayer dealer;
    private Integer num;
    private Long wager;
    private int playerWallet = 1000;

    //Constant variables.
    public static final String RED = "red";
    public static final String BLACK = "black";
    public static final String GREEN = "green";
    public static final String ODD = "odd";
    public static final String EVEN = "even";

    //Need a method to "spin the wheel"--> generate a random number between 0 and 36.
    //Need a method to generate a random color (red/black/green).
    //Can possibly equate colors to numbers as finals.
    //Need a method to determine whether number is even or odd.
    //Need sout to explain winner gain ratios.


    //Change null values later
    Console console = new Console(null, null);
    //Roulette game
    Roulette roulette = new Roulette();
    //Roulette player
    RoulettePlayer roulettePlayer = new RoulettePlayer();

        public Roulette() {
            this.base = (RoulettePlayer) base;
            this.dealer = (RoulettePlayer) this.dealer;
        }

        //This method should start the game.
        public void playGame() {

        }


        //Should return a random number between 0 and 36 (spin)
        public Integer getSpin(){
            Random random = new Random();
            Integer num = random.nextInt(36) + 1;
            roulette.getColor(num);
            roulette.getOddEven(num);
            return num;
        }

        //Should return color and number of spin
        public String getColor(Integer num) {
            String result = "";
            if (num % 2 == 1 && num != 0) {
                result = RED + " " + num;
            } else if (num % 2 == 0 && num != 0) {
                result = BLACK + " " + num;
            }
            result = GREEN + " " + 0;
            return result;
        }

        //Should return ODD or EVEN result.
        public String getOddEven(Integer num) {
            String oddeven = "";
            if (num % 2 == 0) {
                oddeven = EVEN;
            }
            if (num % 2 != 0) {
                oddeven = ODD;
            }
            return oddeven;
        }

        public String getWinsOrLosses() {
            return null;
        }

//        public void placeWager() {
//            Long wager = console.getLongInput();
//            if (wager >= 10) {
//        }

    //toString should include player's spin results and wins or losses.
//    @Override
//    public String toString() {
//        return "Roulette{" +
//                "console=" + console +
//                ", wager=" + wager +
//                ", playerWallet=" + playerWallet +
//                ", welcomePrompt='" + welcomePrompt + '\'' +
//                ", random=" + random +
//                ", player=" + player +
//                ", dealer=" + dealer +
//                ", num=" + num +
//                '}';
//    }


    @Override
    public void placeWager() {

    }

    @Override
    public void increaseMinBet() {

    }

    @Override
    public void decreaseMinBet() {

    }
}