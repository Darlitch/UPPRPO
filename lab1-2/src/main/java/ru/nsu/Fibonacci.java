package ru.nsu;

public class Fibonacci {
    public static int findFibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default: {
                int fPrev = 1;
                int fCurr = 1;
                for (int i = 3; i <= n; ++i) {
                    int temp = fPrev + fCurr;
                    fPrev = fCurr;
                    fCurr = temp;
                }
                return fCurr;
            }
        }
    }
}
