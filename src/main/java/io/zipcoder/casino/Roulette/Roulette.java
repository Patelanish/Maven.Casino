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
    private Long bet;
    private int playerWallet = 1000;
    private Console console;
    private String outcome;


    RoulettePlayer player = new RoulettePlayer();
    RouletteWheel wheel = new RouletteWheel();


    //Roulette game
    Roulette roulette = new Roulette(base, dealer);

    public Roulette(BasePlayer base, BasePlayer dealer) {
        this.base = (RoulettePlayer) this.base;
        this.dealer = (RoulettePlayer) this.dealer;
    }

    String welcomePrompt = "Welcome to the roulette table! This is a tens table. " +
            "The minimum bet amount is $10!\n";

    //Explaining inside bets, outside bets, and payouts.
    String rulesOutsideWagers =
            "You can make an inside bet or outside bet.\n" +
                    "\tOutside Wagers: \n" +
                    "\t1. RED or BLACK - Bet on the color of the winning number.\n" +
                    "\t2. ODD or EVEN - Bet on whether the winning number will be odd or even.\n" +
                    "\t3. DOZENS - Bet on one of the three dozen that are found on the layout of the table.\n" +
                    "\t4. COLUMNS - Bet from which of the three columns will the winning number be.\n" +
                    "\n";

    String rulesInsideWagers =
            "\tInside Wagers: \n" +
                    "\t5. STRAIGHT - This is a bet that covers only one number. In order to make this bet, place the chip inside the square of the number.\n" +
                    "\t6. SPLIT - A bet on two numbers which are adjacent on the table, made by placing the chip on the shared line of the two numbers’ squares.\n" +
                    "\t7. STREET - A bet on three consecutive numbers located on the same line. Make the bet by placing the chip on the outer corner of the row.\n" +
                    "\t8. SIX LINE - A bet on two adjacent lines. In order to make this bet, you have to place the chip on the common outer corner of the two lines.\n" +
                    "\t9. CORNER - This is a four-number bet, placed by putting the chip on the common corner of the four numbers. Also called ‘square’ bet.\n" +
                    "\t10. TRIO - A three-number bet that includes the zero or zeros. Place the chip on the line shared by the zero box and the two other numbers.\n" +
                    "\t11. FIVE NUMBERS - Bet on 0, 1, 2 and 3 with a chip on the corner shared by the zero box and the first line. In American Roulette, it includes the double zero.\n" +
                    "***In order to place a bet and begin playing, type 'Y'. Type 'N' to return back to the lobby.\n" +
                    "\n";

    String rulesPayouts =
            "PAYOUTS: \n" +
                    "1 : 1 -- R/B & O/E \n" +
                    "2 : 1 -- COLUMNS & DOZENS\n" +
                    "5 : 1 -- SIX LINE\n" +
                    "6 : 1 -- FIVE NUMBERS\n" +
                    "8 : 1 -- CORNER \n" +
                    "11 : 1 -- STREET & TRIO\n" +
                    "17 : 1 -- SPLIT\n" +
                    "35 : 1 -- STRAIGHT\n" +
                    "\n";

    String playerSetWagers =
            "Decide on your wagers and type in their corresponding numbers. Remember the minimum wager is $10: ";

    public void welcome() {
        console.println(welcomePrompt.toString());
    }



    public void getOutcome(){
        Integer bet = player.getBet();
        try {
            int num = bet;
            if (num == wheel.getNum()){
                outcome = " You win 50 plus your original wager!";
                player.updateWallet(30);
            } else {
                outcome = "You lose the game";
                player.updateWallet(0);
            }
        } catch (NumberFormatException e){
            if (bet.equals("odd")){
                if (wheel.getNum() %2 == 0){
                    outcome = "You lose the game";
                    player.updateWallet(0);
                } else {
                    outcome = "You win double your bet!";
                    player.updateWallet(2);
                }
            } else if (bet.equals("equals")){
                if (wheel.getNum() %2 == 0){
                    outcome = "You win double your bet!";
                    player.updateWallet(2);
                }
            }
        }
    }

    private void displayOutcome(){

    }

    public void run(){
        System.out.println("Welcome to the Roulette tens table! The minimum bet is $10. Spread your ten around.\n"
                + " If you select the correct color, you win double your bet\n"
                + " If you select the correct odd/even, you win double your bet\n"
                + " If you select the right number, you win 30 TIMES your bet\n"
                + " Otherwise you lose your bet\n"
                + " If you lose all your money, the game is over");

        do {
            player.placeWager();
            player.setBet();
            wheel.spin();
            wheel.display();
            getOutcome();
            displayOutcome();
        } while (true);
    }

    @Override
    public void welcomeMessage() {

    }

    @Override
    public String placeWager() {
        return null;
    }

    @Override
    public void increaseMinBet() {

    }

    @Override
    public void decreaseMinBet() {

    }
}
