package org.ncrm;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest extends TestCase {
    @Test
    @DisplayName("Ajout de deux nombre")
    public void testAdd() {
        assertEquals(6, new Calculator().add(3, 3));
    }

    @Test
    @DisplayName("soustraire deux nombres")
    public void testSubtract() {
        assertEquals(6, new Calculator().subtract(12, 6));
    }

    @Test
    @DisplayName("multiplier deux nombres")
    public void testMultiply() {
        assertEquals(6, new Calculator().multiply(2, 3));
    }

    @Test
    @DisplayName("Diviser deux nombres")
    public void testDiv() {
        assertEquals(6.0, new Calculator().div(36, 6));
    }
}