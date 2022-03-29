package com.example.simplecalculatr;

public class Calculator {
    public double calculator(String mark , double da, double db){
        double result = 0;
        switch (mark) {
            case "Add":
                result = da + db;
                break;

            case "Sub":
                result = da - db;
                break;

            case "Div":
                result = da / db;
                break;

            case "Mul":
                result = da * db;
                break;

            case "Exp":
                result = Math.pow(da, db);
                break;

            case "Log":
                result = Math.log(db) / Math.log(da);
                break;
        }

        return result;
    }

    double fac(double n) {
        if (n < 2) return 1;

        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }
    public double facResult(double da){
        if (da > 21) return Double.POSITIVE_INFINITY;
        return fac(da);
    }
}
