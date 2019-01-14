/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learn.jenkins.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ArshiaAziz
 */
@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;
    
    @RequestMapping("/sum")
    public String sum(@RequestParam("a")Integer a, @RequestParam("b")Integer b){
        return String.valueOf(calculator.sum(a, b));
    }
    
    @RequestMapping("/subtract")
    public String subtract(@RequestParam("a")Integer a, @RequestParam("b") Integer b){
        return String.valueOf(calculator.subtract(a, b));
    }
}
