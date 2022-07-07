package telran.fibonacci.controller;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(8);
        for (Integer num: fib){

            System.out.print(num + "\t");

            //TODO: print all numbers 1,1,2,3,5,8,13,21


        }
        //TODO: print sum of all numbers 1,1,2,3,5,8,13,21 (54)

    }

}
