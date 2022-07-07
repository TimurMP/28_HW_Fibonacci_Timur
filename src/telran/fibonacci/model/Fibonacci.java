package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
    private int quantity;


    public Fibonacci(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public Iterator<Integer> iterator() {


        return new Iterator<Integer>() {
            int currentPos = 0;
            int num = 0;
            int num1 = 1;

            @Override
            public boolean hasNext() {
                return currentPos < quantity;
            }

            @Override
            public Integer next() {
                if (currentPos == 0) {
                    currentPos++;
                    return 1;
                }
                int res = num + num1;
                num = num1;
                num1 = res;
                currentPos++;
                return res;
            }
        };
    }
}
