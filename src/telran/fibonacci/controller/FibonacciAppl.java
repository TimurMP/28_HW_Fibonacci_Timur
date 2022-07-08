package telran.fibonacci.controller;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(8);
        int sum = 0;
        for (Integer num : fib) {
            System.out.print(num + "\t");
            sum += num;
        }
        System.out.println("\n" + sum);


    }

}
