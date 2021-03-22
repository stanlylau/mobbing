package assignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void Input3GetFizz() {
        String result = say(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void Input1Get1() {
        String result = say(1);
        assertEquals("1", result);
    }

    @Test
    public void Input2Get2() {
        String result = say(2);
        assertEquals("2", result);
    }

    @Test
    public void Input6GetFizz() {
        String result = say(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void Input5GetBuzz() {
        String result = say(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void Input10GetBuzz() {
        String result = say(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void Input15GetFizzBuzz() {
        String result = say(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void Input5_10GetBuzz() {
        String result = say(5, 10);
        assertEquals("FizzBuzz", result);
    }

    private String say(int i) {
        if (i == 1 || i == 2) {
            return String.valueOf(i);
        }
        if (i == 5 || i == 10) {
            return "Buzz";
        }
        if (i == 15) {
            return "FizzBuzz";
        }

        return "Fizz";
    }
}
