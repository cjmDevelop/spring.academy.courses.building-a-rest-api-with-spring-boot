package example.cashcard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CashCardJsonTest {

   //Initial Test is now in the Green Zone: Test is passing.
    @Test
    public void myFirstTest() {
        assertThat(42).isEqualTo(42);
    }
}
   /*The Red, Green, Refactor Loop
    - Red zone is when we write a failing test for the desired functionality.
    - Green zone is when we implement the simplest and most concise solution to make the test pass.
    - Refactor / look for opportunities to further reduce / simplify, and make the code more efficient
      by reducing unneeded code; repeat the cycle.*/
