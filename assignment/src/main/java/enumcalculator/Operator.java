package enumcalculator;

import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

/**
 * Enum with operations. Example of how to use lambda expressions in an (enum)
 * constructor. This calculator works with an IntBinaryOperator, which means
 * that the result is always an integer; divisions are INTEGER-DIVISIONS. Don't 
 * worry about calculation results that are too big to fit the int data type.
 * (overflow and underflow).
 *
 * @author Pieter van den Hombergh / Richard van den Ham
 */
public enum Operator {
    //TODO Define enum values
    ;

    /**
     * Get the operator using its symbol. This method does a linear search
     * through the values of this enum.
     *
     * @param symbol to search
     * @return operation when found, null otherwise.
     */
    public static Operator get(String symbol) {
        //TODO Implement get method
          throw new UnsupportedOperationException("method not implemented");
    }

    /**
     * The operation is a IntBinaryOperator.
     *
     */
    private final IntBinaryOperator computation;
    /**
     * The symbol that identifies the operation.
     */
    private final String symbol;

    /**
     * The constructor to create the Operation instances.
     *
     * @param symbol of this operator
     * @param computation the actual method
     */
    Operator(String symbol, IntBinaryOperator computation) {
        this.symbol = symbol;
        this.computation = computation;
    }

    /**
     * Execute the calculation.
     *
     * @param a first param
     * @param b second param
     * @return result of the computation.
     */
    public int compute(int a, int b) {
        //TODO Implement compute method
        return 0;
    }

    /**
     * Get the symbols of supported operators.
     *
     * @return String array containing all supported operations.
     */
    public static String[] supportedSymbols() {
        //TODO Implement method
        return null;
    }
}
