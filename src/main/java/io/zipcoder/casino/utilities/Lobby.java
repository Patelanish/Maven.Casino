package io.zipcoder.casino.utilities;

import io.zipcoder.casino.CardGames.Blackjack.Blackjack;
import io.zipcoder.casino.CardGames.Poker.Poker;
import io.zipcoder.casino.DiceGames.Craps.Craps;
<<<<<<< HEAD
import io.zipcoder.casino.Roulette.Roulette;
=======
import io.zipcoder.casino.DiceGames.LastChance.LastChance;
//import io.zipcoder.casino.Roulette.Roulette;
>>>>>>> d2ed9a1649ceccfdb57d01ccde2b86bc5e3be9d9

public class Lobby {
    private Console console;


    public Lobby() {


    }
<<<<<<< HEAD
    public Lobby(BasePlayer base,BasePlayer dealer){

        System.out.println("Welcome "+base.getName()+" to Blitz & Chips the most exclusive Casino in the World");
        String game = console.getStringInput("Please choose a game below");

        switch(game){
            case "BlackJack" :
                Blackjack bj = new Blackjack(base, dealer);
                break;
            case "Poker" :
                Poker poker = new Poker(base,dealer);
                break;
            case "GoFish" :
                //GoFish gofish = new GoFish(base,dealer);
                break;
            case "Roulette" :
                Roulette roulette = new Roulette();
                break;
            case "Craps" :
                Craps craps = new Craps(base,dealer);
                break;
            case "Last Chance" :
                //LastChance lc = new LastChance(base,dealer);
=======
>>>>>>> d2ed9a1649ceccfdb57d01ccde2b86bc5e3be9d9

    public Lobby(Console console, BasePlayer base, BasePlayer dealer) {
    this.console = console;
        //System.out.println("Welcome " + base.getName() + " to Blitz & Chips the most exclusive Casino in the World");
        boolean gameRunning = true;
        while (gameRunning) {
            String game = console.getStringInput("Please choose a game below");

            switch (game) {
                case "BlackJack":
                    Blackjack bj = new Blackjack(base,dealer,console);
                    break;
                case "Poker":
                    Poker poker = new Poker(base, dealer, console);
                    break;
                case "GoFish":
                    GoFish gofish = new GoFish(base, dealer, console);
                    break;
                case "Roulette":
                    //Roulette roulette = new Roulette(base,dealer);
                    break;
                case "Craps":
                    Craps craps = new Craps(base, dealer);
                    break;
                case "Last Chance":
                    //LastChance lc = new LastChance(base,dealer);
                    break;
                case "Exit":
                    gameRunning = false;
                    break;


            }

        }


        //make base PLayer
        //create a menu class to display
        //initiate games based on option
    }
}
