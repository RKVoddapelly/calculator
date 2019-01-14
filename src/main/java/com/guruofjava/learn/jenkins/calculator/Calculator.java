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
    public int sum(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
}
