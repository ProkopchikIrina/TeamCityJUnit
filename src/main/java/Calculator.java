import static java.lang.Double.NaN;

/**
 * Created by Irina on 30.03.2018.
 */

public class Calculator {
    public double addition(double number1, double number2) {
        return round(number1 + number2);
    }

    public double subtract(double number1, double number2) {
        return round(number1 - number2);
    }

    public double multiply(double number1, double number2) {
        return round(number1 * number2);
    }

    public double divide(double number1, double number2) {
        if(number2!=0) {
            return round(number1 / number2);
        }
        return NaN;
    }
    public double sqrt(double number) {
        if(number>=0) {
            return round(Math.sqrt(number));
        }
        return NaN;
    }

    public double percent(double number1, double number2) {
        return round(number1 * number2 / 100);
    }

    public double pow(double number1, double number2) {
        return round(Math.pow(number1,number2));
    }

    private double round(double number)
    {
        number=number*10000;
        int i=(int)Math.round(number);
        number=(double)i/10000;
        return number;
    }
}