
package io.zipcoder.casino;

import io.zipcoder.casino.CardGames.UtilitiesCards.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class DeckTests {
    private Deck testDeck;
    private ArrayList<Card> testHand;

    @Before
    public void setup(){
        testDeck = new Deck();
        testHand = new ArrayList<>();
    }

    @Test
    public void sizeTest(){
        Integer expected = 52;
        Integer actual = testDeck.getDeckSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void drawAndSizeTest(){
        Integer expected = 51;
        testDeck.draw();
        Integer actual = testDeck.getDeckSize();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void DrawTest(){
        String expected = "K of Clubs";
        Card thisCard = testDeck.draw();
        String actual = thisCard.printCard();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DrawTest2(){
        String expected = "Q of Clubs";
        testDeck.draw();
        Card thisCard = testDeck.draw();
        String actual = thisCard.printCard();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shuffleTest(){
        String unexpected = "K of Clubs";
        while ((testDeck.cards.peek().printCard()).equals("K of Clubs")){
            testDeck.shuffle();
        }
        Card thisCard = testDeck.draw();
        String actual = thisCard.printCard();
        Assert.assertNotEquals(unexpected, actual);
    }


    @Test
    public void addCardTest(){
        String expected = "A of Diamonds";
        testDeck.draw();
        testDeck.add(new Card(Suit.DIAMONDS, Rank.ACE, Suit.DIAMONDS.getSuitImage()));
        Card thisCard = testDeck.cards.get(51);
        String actual = thisCard.printCard();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void discardTest(){
        String expected = "K of Clubs";
        testDeck.burn(1);
        String actual = testDeck.discardPile.peek().printCard();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void discardTest2(){
        Integer expected = 5;
        testDeck.burn(5);
        Integer actual = testDeck.getDiscardPileSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void discardTest3(){
        Integer expected = 47;
        testDeck.burn(5);
        Integer actual = testDeck.getDeckSize();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getHandTest(){
        testHand = new ArrayList<>(testDeck.getHand(7));
        Integer expected = 7;
        Hand.showHand(testHand);
        Integer actual = testHand.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHandTest2(){
        testHand = new ArrayList<>(testDeck.getHand(10));
        Integer expected = 10;
        Integer actual = testHand.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHandTest3(){
        testHand = new ArrayList<>(testDeck.getHand(10));
        Integer expected = 42;
        Integer actual = testDeck.getDeckSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortHandTest(){
        String expected = "Four of Clubs\n" +
                "Five of Clubs\n" +
                "Six of Clubs\n" +
                "Seven of Clubs\n" +
                "Eight of Clubs\n" +
                "Nine of Clubs\n" +
                "Ten of Clubs\n" +
                "J of Clubs\n" +
                "Q of Clubs\n" +
                "K of Clubs\n";
        testHand = new ArrayList<>(testDeck.getHand(10));
        Hand.sortHandByNumber(testHand);
        String actual = Hand.showHand(testHand);
        Assert.assertEquals(expected, actual);
        Hand.sortHandByNumber(testHand);
//        Integer actual = testHand.getHandSize();
//        Assert.assertEquals(expected, actual);

    }

}

