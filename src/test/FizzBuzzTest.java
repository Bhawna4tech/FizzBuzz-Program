package test;

import main.FizzBuzz;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bhawnak on 13/02/2017.
 */
public class FizzBuzzTest {

    @Test
    public void displayShouldReturnNumberWhenNumberIsNot3or5() {
        String actualResult = new FizzBuzz().display(4);
        String expectedResult = "4";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void displayShouldReturnFizzwhenNumberIsMultipleOf3() {
        String actualResult = new FizzBuzz().display(6);
        String expectedResult = "Fizz";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void displayShouldReturnBuzzWhenNumberIsMultipleOf5() {
        String actualResult = new FizzBuzz().display(10);
        String expectedResult = "Buzz";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void displayShouldReturnBuzzWhenNumberIsMultipleOf15() {
        String actualResult = new FizzBuzz().display(30);
        String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, actualResult);
    }


}
