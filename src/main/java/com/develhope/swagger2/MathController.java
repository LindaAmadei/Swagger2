package com.develhope.swagger2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MathController {

    @GetMapping("/welcome") //corrisponde all'indirizzo localhost5050/welcome
    public String welcomeMathMsg(){
        return "Welcome to our calculator";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo(){
        ArithmeticOperation division = new ArithmeticOperation
                ("Division", 2, "process of calculating the number of times one number is contained within another",
                        new String [] {"Distributive", "Invariant"});
        return division;


    }

    @GetMapping("/multiplication")
    public int multiplication (@RequestParam int a, @RequestParam int b) {
        return a*b;
    }

    @GetMapping("/square/{n}")
    public double square(@PathVariable int n) {
        return Math.pow(n, 2);
    }
}
