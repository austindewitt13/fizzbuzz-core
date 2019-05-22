package edu.cnm.deepdive;

/**
 * <p>This class invokes the methods of the {@link FizzBuzz} class.</p>
 *
 * @author Austin DeWitt &amp; Deep Dive Coding Java+Android Cohort 7.
 */
public class Main {

  private Main(){}

  /**
   * Computes and displays the fizz buzz values corresponding to the input values 1&ndash;100.
   *
   * @param args Command line arguments (ignored).
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100000; i++) {
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }

  }

}
