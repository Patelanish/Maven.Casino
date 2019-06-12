package io.zipcoder.casino.Roulette;

import io.zipcoder.casino.utilities.BasePlayer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RouletteTest {

    @Test
    void getColor(Integer num) {
       Roulette roulette = new Roulette(null, null);
        //Given
        String expectedColor = "red";

       //When
        String actualColor = roulette.getColor(4);


       //Then
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Test
    void getColor2(Integer num) {
        Roulette roulette = new Roulette(null, null);
        //Given
        String expectedColor = "black";

        //When
        String actualColor = roulette.getColor(7);


        //Then
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Test
    void getColor3(Integer num) {
        Roulette roulette = new Roulette(null, null);
        //Given
        String expectedColor = "green";

        //When
        String actualColor = roulette.getColor(0);


        //Then
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Test
    void getColor4(Integer num) {
        Roulette roulette = new Roulette(null, null);
        //Given
        String expectedColor = "red";

        //When
        String actualColor = roulette.getColor(22);


        //Then
        Assert.assertEquals(expectedColor, actualColor);
    }

//    @Test
//    void getColor5(Integer num) {
//        Roulette roulette = new Roulette(null, null);
//        //Given
//        String expectedColor = "black";
//
//        //When
//        String actualColor = roulette.getColor(35);
//
//
//        //Then
//        Assert.assertEquals(expectedColor, actualColor);
//    }

    @Test
    void getColor6(Integer num) {
        Roulette roulette = new Roulette(null, null);
        //Given
        String expectedColor = null;

        //When
        String actualColor = roulette.getColor(37);


        //Then
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Test
    void getNumber() {
        //Given

        //When

        //Then
    }

    @Test
    void getColor1() {
        //Given

        //When

        //Then
    }

    @Test
    void getSpin() {
        //Given

        //When

        //Then
    }
}