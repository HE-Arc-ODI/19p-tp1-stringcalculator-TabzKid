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
}