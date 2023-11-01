package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void return30_whenAIs10AndBIs20(){
        //Given
        int a = 10;
        int b = 20;
        int expected = 30;

        //When
        int actual = Main.add(a,b);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    void returnTrue_whenNumberIsEven(){
        //Given
        int n = 20;
        //When
        boolean actual = Main.isEven(n);
        //Then
        assertTrue(actual);

    }

    @Test
    void return30_whenAIs6AndBIs5(){
        //Given
        int a = 6;
        int b = 5;
        int expected = 30;

        //When
        int actual = Main.multiplication(a,b);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    void returnTrue_whenStringIsUpperCase(){
        //Given
        String a = "hallo";
        String expected = "HALLO";

        //When
        String actual = Main.turnStringInUpperCase(a);

        //Then
        assertEquals(expected, actual);


    }

    @Test
    void returnTrue_whenNumberIsPositive(){
        //Given
        int n = 3;
        //When
        boolean actual = Main.isPositive(n);

        //Then
        assertTrue(actual);

    }
}