/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learn.jenkins.calculator;

import org.springframework.stereotype.Service;

/**
 *
 * @author ArshiaAziz
 */
@Service
public class Calculator {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int sum(final int a, final int b) {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int subtract(final int a, final int b) {
        return a - b;
    }
}
