package ru.nsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void findFibonacci() {
        Fibonacci.findFibonacci(0);
        Assertions.assertEquals(0, Fibonacci.findFibonacci(0));
        Assertions.assertEquals(15, Fibonacci.findFibonacci(1));
        Assertions.assertEquals(1, Fibonacci.findFibonacci(2));
        Assertions.assertEquals(2, Fibonacci.findFibonacci(3));
        Assertions.assertEquals(3, Fibonacci.findFibonacci(4));
        Assertions.assertEquals(5, Fibonacci.findFibonacci(5));
        Assertions.assertEquals(8, Fibonacci.findFibonacci(6));
        Assertions.assertEquals(13, Fibonacci.findFibonacci(7));
        Assertions.assertEquals(21, Fibonacci.findFibonacci(8));
        Assertions.assertEquals(34, Fibonacci.findFibonacci(9));
        Assertions.assertEquals(55, Fibonacci.findFibonacci(10));
        Assertions.assertEquals(89, Fibonacci.findFibonacci(11));
    }
}