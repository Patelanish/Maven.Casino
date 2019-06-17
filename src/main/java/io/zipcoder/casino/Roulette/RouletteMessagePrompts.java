package io.zipcoder.casino.Roulette;

import io.zipcoder.casino.utilities.Console;

public class RouletteMessagePrompts {
    Console console;

    public void RouletteMessagePrompts() {
    }

    String welcomePrompt = "Welcome to the roulette table! This is a tens table. " +
            "The minimum bet amount is $10! You can spread your ten around. Would you like to place a bet?\n";

    //Explaining inside bets, outside bets, and payouts.
    String rulesOutsideWagers =
            "You can make an inside bet, outside bet, or both.\n" +
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


    //Prints welcome prompt
    public void getWelcomePrompt() {

        console.println(welcomePrompt.toString());
    }
    //Prints outside wager rules
    public void getRulesOutsideWagers() {

        console.println(rulesOutsideWagers.toString());
    }

    //Prints inside wager rules
    public void getRulesInsideWagers() {

        console.println(rulesInsideWagers.toString());
    }

    //Prints payout rules
    public void getRulesPayouts() {

        console.println(rulesPayouts.toString());
    }

    //Prints player wager choice prompt
    public void getPlayerSetWagers() {
        console.println(playerSetWagers.toString());
    }
}
