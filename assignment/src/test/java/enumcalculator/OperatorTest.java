package enumcalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.fail;
import org.assertj.core.api.Assumptions;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        "add      , + ," + ( 2 + 3 ) + ", 2, 3 " //comma separated string
        //TODO Add additional test cases here.
    } )
    public void testOperator( String message, String symbol, int expected, int a, int b ) {
        // use all inputs in the assertThat
        //TODO Write assertThat statement in parameterized test method
        fail( "test not yet implemented" );
    }
    
    /**
     * testSupportedOperators.
     * Should be +, -, *, /, **
     */
    @Test
    public void testSupportedOperators() {
        //TODO Write assertThat statement to test whether all operations are supported
        fail( "test not yet implemented" );
    }
    
    /**
     * Test that a division by zero results in IllegalArgumentException.
     */
    @Test
    public void testDivisionByZeroNotAllowed() {
        //TODO Write test to assure that a division by zero results in IllegalArgumentException
        fail( "test not yet implemented" );
    }
}
