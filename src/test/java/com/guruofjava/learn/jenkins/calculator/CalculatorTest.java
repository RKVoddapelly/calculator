/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learn.jenkins.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ArshiaAziz
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        Assert.assertEquals(5, calculator.sum(3, 2));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(5, calculator.subtract(10, 5));
    }
}
