package io.zipcoder.casino.utilities;

import io.zipcoder.casino.CardGames.Blackjack.Blackjack;
import io.zipcoder.casino.CardGames.GoFish.GoFish;
import io.zipcoder.casino.CardGames.Poker.Poker;
import io.zipcoder.casino.CardGames.Poker.PokerUserManager;
import io.zipcoder.casino.DiceGames.Craps.Craps;
import io.zipcoder.casino.Roulette.Roulette;
import io.zipcoder.casino.DiceGames.LastChance.LastChance;
import io.zipcoder.casino.Roulette.Roulette;
<<<<<<< HEAD

=======
//import io.zipcoder.casino.Roulette.Roulette;
>>>>>>> 1b8161dd222d5c41dcafc38bdab9dc76138e0562

public class Lobby {

    private Console console;

    public Lobby() {


    }
    public Lobby(BasePlayer base,BasePlayer dealer) {

        System.out.println("Welcome " + base.getName() + " to Blitz & Chips the most exclusive Casino in the World");
        String game = console.getStringInput("Please choose a game below");

        switch (game) {
            case "BlackJack":
                Blackjack bj = new Blackjack(base, dealer);
                break;
//            case "Poker":
//                Poker poker = new Poker(base, dealer);
//                break;
            case "GoFish":
                //GoFish gofish = new GoFish(base,dealer);
                break;
            case "Roulette":
                Roulette roulette = new Roulette(base, dealer);
                break;
            case "Craps":
                Craps craps = new Craps(base, dealer);
                break;
            case "Last Chance":
                //LastChance lc = new LastChance(base,dealer);
        }
    }

    public Lobby(Console console, BasePlayer base, BasePlayer dealer) {
<<<<<<< HEAD
    this.console = console;
        System.out.println("Welcome " + base.getName() + " to Blitz & Chips the most exclusive Casino in the World");
=======
        this.console = console;
<<<<<<< HEAD
>>>>>>> 0a27709b1852f3f6bfa330602d70b1e76f9e1564
=======
        //System.out.println("Welcome " + base.getName() + " to Blitz & Chips the most exclusive Casino in the World");
>>>>>>> 1b8161dd222d5c41dcafc38bdab9dc76138e0562
        boolean gameRunning = true;
        while (gameRunning) {
            console.println(base.printChar(console));
            console.println("1.) BlackJack\n2.) Poker\n3.) GoFish\n4.) Roulette\n5.) Craps\n6.) Last Chance\n7.) Bar\n8.) Exit\n");
            String game = console.getStringInput("Please choose a game below");

            switch (game.toUpperCase()) {
                case "BLACKJACK":
                    Blackjack bj = new Blackjack(base, dealer, console);
                    break;

                case "POKER":
                    PokerUserManager poker = new PokerUserManager(base, dealer, console);
                    break;
                case "GOFISH":
                    GoFish gofish = new GoFish(base, dealer, console);
                    break;
                case "ROULETTE":
                    Roulette roulette = new Roulette(base,dealer);
                    break;
                case "CRAPS":
                    Craps craps = new Craps(base, dealer, console);
                    break;
                case "LAST CHANCE":
                    LastChance lc = new LastChance(base,dealer, console);
                    break;
                case "BAR":
                    Bar bar = new Bar(base);
                    break;
                case "EXIT":
                    console.println("Thanks for stoppin' by!");
                    gameRunning = false;
                    break;
<<<<<<< HEAD
=======

>>>>>>> 1b8161dd222d5c41dcafc38bdab9dc76138e0562
            }
        }
<<<<<<< HEAD
    }
<<<<<<< HEAD
=======

//    public void printMenu() {
//        console.println("1.) BlackJack\n2.) Poker\n3.) GoFish\n4.) Roulette\n5.) Craps\n6.) Last Chance\n7.) Exit");
//        String game = console.getStringInput("Please choose a game below");
//    }


    //make base PLayer
    //create a menu class to display
    //initiate games based on option
>>>>>>> 0a27709b1852f3f6bfa330602d70b1e76f9e1564
=======


        //make base PLayer
        //create a menu class to display
        //initiate games based on option
    }
>>>>>>> 1b8161dd222d5c41dcafc38bdab9dc76138e0562
}
