package main;

/**
 * Created by bhawnak on 13/02/2017.
 */
public class FizzBuzz {
    public String display(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else
            return String.valueOf(i);
    }
}
