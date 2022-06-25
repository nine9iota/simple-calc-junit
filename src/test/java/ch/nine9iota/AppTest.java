package ch.nine9iota;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAddIntegers() {
        // given
        App calc = new App();

        // when
        int result = App.add(2, 3);

        // then
        assertEquals(5, result);
    }

    @Test
    public void shouldSubtractIntegers() {
        // given
        App calc = new App();

        // when
        int result = App.subtract(6, 2);

        // then
        assertEquals(4, result);
    }

    @Test
    public void shouldMultiplyIntegers() {
        // given
        App calc = new App();

        // when
        int result = App.multiply(4, 4);

        // then
        assertEquals(16, result);
    }

    @Test
    public void shouldDivideIntegers() {
        // given
        App calc = new App();

        // when
        int result = App.divide(8, 4);

        // then
        assertEquals(2, result);
    }

    @Test
    public void shouldModuloIntegers() {
        // given
        App calc = new App();

        // when
        int result = App.modulo(8, 5);

        // then
        assertEquals(3, result);
    }
}
