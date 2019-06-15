package io.zipcoder.casino.Roulette;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static io.zipcoder.casino.Roulette.Roulette.*;

class RouletteTest {


    @Test
    public void getWelcomePrompt() {
        //Given
        RouletteMessagePrompts prompts = new RouletteMessagePrompts();

        //When
        String expected = "Welcome to the roulette table! This is a tens table. " +
                "The minimum bet amount is $10! You can spread your ten around. Would you like to place a bet?\n";
        String actual = prompts.getWelcomePrompt();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOutsideWagers() {
        //Given
        RouletteMessagePrompts prompts = new RouletteMessagePrompts();

        //When
        String expected =
                "You can make an inside bet, outside bet, or both.\n" +
                        "\tOutside Wagers: \n" +
                        "\t1. RED or BLACK - Bet on the color of the winning number.\n" +
                        "\t2. ODD or EVEN - Bet on whether the winning number will be odd or even.\n" +
                        "\t3. DOZENS - Bet on one of the three dozen that are found on the layout of the table.\n" +
                        "\t4. COLUMNS - Bet from which of the three columns will the winning number be.\n" +
                        "\n";
        String actual = prompts.getOutsideWagers();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInsideWagers() {
        //Given
        RouletteMessagePrompts prompts = new RouletteMessagePrompts();

        //When
        String expected =
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
        String actual = prompts.getInsideWagers();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPayouts() {
        //Given
        RouletteMessagePrompts prompts = new RouletteMessagePrompts();

        //When
        String expected =  "PAYOUTS: \n" +
                "1 : 1 -- R/B & O/E \n" +
                "2 : 1 -- COLUMNS & DOZENS\n" +
                "5 : 1 -- SIX LINE\n" +
                "6 : 1 -- FIVE NUMBERS\n" +
                "8 : 1 -- CORNER \n" +
                "11 : 1 -- STREET & TRIO\n" +
                "17 : 1 -- SPLIT\n" +
                "35 : 1 -- STRAIGHT\n" +
                "\n";
        String actual = prompts.getPayouts();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlayerChoice() {
        //Given
        RouletteMessagePrompts prompts = new RouletteMessagePrompts();

        //When
        String expected = "Decide on your wagers and type in their corresponding numbers. Remember the minimum wager is $10: ";
        String actual = prompts.getPlayerChoice();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSpin() {
        //Given
        Roulette roulette = new Roulette();
        Random random = new Random();

        //When
        Integer expected = random.nextInt(36) + 1;
        Integer actual = roulette.getSpin();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "red";
        String actual = roulette.getColor(9);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor2(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "red";
        String actual = roulette.getColor(17);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor3(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "red";
        String actual = roulette.getColor(29);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor4(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "black";
        String actual = roulette.getColor(2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor5(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "black";
        String actual = roulette.getColor(30);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor6(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "black";
        String actual = roulette.getColor(6);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColor7(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = "green";
        String actual = roulette.getColor(0);

        //Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    void getNumber() {
//        Roulette roulette = new Roulette(null, null);
//        //Given and When
//
//        Integer actualNum = roulette.getNumber();
//        Boolean expectedNum = (Boolean) isBetween0and36(actualNum);
//
//        //Then
//        Assert.assertEquals(expectedNum, );
//    }
//
//    public boolean isBetween0and36(Integer actualNum) {
//        if (actualNum >= 0 && actualNum < 37) {
//            return true;
//        } return false;
//    }

    @Test
    void getSpinResults() {
        //Given

        //When

        //Then
    }

    @Test
    public void placeWager() {


    }

    @Test
    public void getOddEvenTest(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = ODD;
        String actual = roulette.getOddEven(7);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest2(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = ODD;
        String actual = roulette.getOddEven(33);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest3(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = ODD;
        String actual = roulette.getOddEven(19);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest4(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = EVEN;
        String actual = roulette.getOddEven(10);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest5(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = EVEN;
        String actual = roulette.getOddEven(18);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest6(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = EVEN;
        String actual = roulette.getOddEven(32);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest7(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = EVEN;
        String actual = roulette.getOddEven(0);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest8(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = EVEN;
        String actual = roulette.getOddEven(12);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddEvenTest9(Integer num) {
        //Given
        Roulette roulette = new Roulette();

        //When
        String expected = ODD;
        String actual = roulette.getOddEven(25);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void increaseMinBet() {

    }

    @Test
    public void decreaseMinBet() {

    }
}