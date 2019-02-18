import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    @Before
    public void setUp() {
    }

    /**
     * Test empty String
     */
    @Test
    public void testEmptyString() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 0;
        String value = "";
        // Act
        int actual = sc.add(value);
        // Assert
        assertThat(actual, is(expected));
    }

    /**
     * Test with number 1
     */
    @Test
    public void testWith1() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 1;
        String value = "1";
        // Act
        int actual = sc.add(value);
        // Assert
        assertThat(actual, is(expected));
    }

    /**
     * Test with number 2
     */
    @Test
    public void testWith2() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 2;
        String value = "2";
        // Act
        int actual = sc.add(value);
        // Assert
        assertThat(actual, is(expected));
    }
}