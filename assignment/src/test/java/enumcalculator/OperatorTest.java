package enumcalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.fail;
import org.assertj.core.api.Assumptions;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.Arrays;

/**
 * Parameterized test for enum operation. Look in [Kaczanowski, ch 3] on how to
 * use parameterized tests.
 *
 * @author Pieter van den Hombergh / Richard van den Ham
 */
public class OperatorTest {

    /**
     * Most of the test input, including the operator symbol. In following
     * exercises you will have to do that on your own. The test data is
     * collected in a set of comma separator lines or records, in which you can
     * access the columns with an index, zero based.
     *
     *
     * @param message for test
     * @param symbol of operation
     * @param expected outcome
     * @param a first value
     * @param b second value
     */
    @ParameterizedTest
    @CsvSource( {
        // message, symbol, expected result, a,b
            "add      , + ," + ( 2 + 3 ) + ", 2, 3 ",
            "subtract , - ," + (2 - 3) + ", 2, 3 ",
            "multiply , * ," + (2 * 3) + ", 2, 3 ",
            "divide , / , " + (2 / 3) + ", 2, 3 ",
            "power , ** , " + (2 * 4) + ", 2, 3 "

    } )
    public void testOperator( String message, String symbol, int expected, int a, int b ) {
        // use all inputs in the assertThat
        assertThat(Operator.get(symbol).compute(a, b))
                .as(message).isEqualTo(expected);
        //fail( "test not yet implemented" );
    }
    
    /**
     * testSupportedOperators.
     * Should be +, -, *, /, **
     */
    @ParameterizedTest
    @CsvSource( {
            "+",
            "-",
            "*",
            "/",
            "**"

    } )
    public void testSupportedOperators(String symbol) {
        boolean contains = Arrays.asList(Operator.supportedSymbols()).contains(symbol);
        boolean t = true;
        assertThat(contains)
                .isEqualTo(t);

        //fail( "test not yet implemented" );
    }
    
    /**
     * Test that a division by zero results in IllegalArgumentException.
     */
    @Test
    public void testDivisionByZeroNotAllowed() {
        ThrowableAssert.ThrowingCallable code = () -> {
            int a = 1;
            int b = 0;
            //Operator operator = Operator
            Operator.get("/").compute(a, b);
        };
        assertThatCode(code).as("Division by zero not possible!")
                .isExactlyInstanceOf(IllegalArgumentException.class);
        //fail( "test not yet implemented" );
    }
}
