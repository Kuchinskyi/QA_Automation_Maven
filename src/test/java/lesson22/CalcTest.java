package lesson22;

import org.hillel.homework.lesson22.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalcTest {

    private static Calculation calculation;

    @BeforeAll
    public static void init() {
        calculation = new Calculation();
        System.out.println("Before all");
    }

    @Test
    @DisplayName("Test subtraction")
    public void testSubtraction() {
        System.out.println("Test 1");
        int result = calculation.subtraction(15, 5);
        Assertions.assertNotEquals(12, result, "Result is wrong - " + result);
    }

    @Test
    @DisplayName("Test exponentiation")
    public void testExponentiation() {
        System.out.println("Test 3");
        double result = calculation.exponentiation(3, 4);
        Assertions.assertEquals(81, result, "Result is wrong - " + result);
    }

    @ParameterizedTest
    @MethodSource("integerStreamProvider")
    @DisplayName("Test square root")
    public void testSquareRoot(int a, int expected) {
        System.out.println("Test 2");
        double result = calculation.squareRoot(a);
        Assertions.assertEquals(result, expected, "Result is wrong - " + result);
    }

    public static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.arguments(9, 3),
                Arguments.arguments(25, 5));
    }
}
