package io.zipcoder.casino.Roulette;

import io.zipcoder.casino.utilities.BasePlayer;
import io.zipcoder.casino.utilities.Console;

import java.util.Scanner;

public class RoulettePlayer extends BasePlayer {
    private String name;
    private BasePlayer player;
    private Integer wallet;
    private Integer bet;
    private Integer win;
    private Console console;
    private Integer amount;

    public RoulettePlayer() {

        super(null);
    }

    public void placeWager() {
        while (bet < player.getWallet() && bet >= 10) {
            bet = console.getIntegerInput("\nHow much would you like to bet? The minimum bet is $10.");
            player.removeFromWallet(bet);
            console.println("Your bet has been placed! Let's play.");
        } if (bet > player.getWallet() && bet < 10) {
            bet = console.getIntegerInput("Invalid bet amount. How much would you like to bet? ");
        }
    }

    public void setBet() {
        Integer typeOfBet = console.getIntegerInput("What is your bet? Select an inside wager or outside wager by number. " +
                "Type in the number: ");
    }

    public Integer getBet() {
        return bet;
    }

    public void updateWallet(int i) {
        player.addToWallet(amount);
        }
    }

