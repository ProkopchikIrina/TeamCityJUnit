import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;

/**
 * Created by Irina on 30.03.2018.
 */

public class CalculatorTest {

    private Calculator calculator;
    private String message="The expected result does not match to the actual";
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void addFractionalPositivesTest() {
        double result = calculator.addition(51, 15.45);
        Assert.assertEquals(message, 66.45, result, 0);
    }

    @Test
    public void addFractionalNegativesTest() {
        double result = calculator.addition(-672.84, -73);
        Assert.assertEquals(message, -745.84, result, 0);
    }

    @Test
    public void addZeroAndNegativeTest() {
        double result = calculator.addition(0, -7);
        Assert.assertEquals(message, -7, result, 0);
    }

    @Test
    public void addTwoFractionalWithIntegerResultTest() {
        double result = calculator.addition(1.7, 1.3);
        Assert.assertEquals(message, 3, result, 0);
    }

    @Test
    public void subtractFractionalPositivesTest() {
        double result = calculator.subtract(137, 34.1);
        Assert.assertEquals(message, 102.9, result, 0);
    }

    @Test
    public void subtractIntegerNegativesTest() {
        double result = calculator.subtract(-4, -12);
        Assert.assertEquals(message, 8, result, 0);
    }

    @Test
    public void subtractNegativeAndZeroTest() {
        double result = calculator.subtract(-4, 0);
        Assert.assertEquals(message, -4, result, 0);
    }

    @Test
    public void subtractFractionalPositivesWithIntegerResultTest() {
        double result = calculator.subtract(1.9, 0.9);
        Assert.assertEquals(message, 1, result, 0);
    }

    @Test
    public void multiplyIntegerPositivesTest() {
        double result = calculator.multiply(109, 5);
        Assert.assertEquals(message, 545, result, 0);
    }

    @Test
    public void multiplyFractionalAndIntegerPositivesTest() {
        double result = calculator.multiply(1.25, 5);
        Assert.assertEquals(message, 6.25, result, 0);
    }

    @Test
    public void multiplyIntegerPositiveByZeroTest() {
        double result = calculator.multiply(51, 0);
        Assert.assertEquals(message, 0, result, 0);
    }

    @Test
    public void multiplyIntegerPositiveByIntegerNegativeTest() {
        double result = calculator.multiply(11, -125);
        Assert.assertEquals(message, -1375, result, 0);
    }

    @Test
    public void multiplyFractionalByIntegerNegativesTest() {
        double result = calculator.multiply(-1.1, -15);
        Assert.assertEquals(message, 16.5, result, 0);
    }

    @Test
    public void divideFractionalPositivesTest() {
        double result = calculator.divide(16.5, 5.5);
        Assert.assertEquals(message, 3, result, 0);
    }

    @Test
    public void divideIntegerPositivesTest() {
        double result = calculator.divide(891, 9);
        Assert.assertEquals(message, 99, result, 0);
    }

    @Test
    public void divideByZeroTest() {
        double result = calculator.divide(463, 0);
        Assert.assertEquals(message, NaN,result,0 );
    }

    @Test
    public void divideIntegerPositivesWithPeriodicalResultTest() {
        double result = calculator.divide(10, 3);
        Assert.assertEquals(message, 3.3333, result, 0);
    }

    @Test
    public void divideIntegerNegativesTest() {
        double result = calculator.divide(-6, -3);
        Assert.assertEquals(message, 2, result, 0);
    }

    @Test
    public void divideZeroByIntegerPositiveTest() {
        double result = calculator.divide(0, 9);
        Assert.assertEquals(message, 0, result, 0);
    }

    @Test
    public void sqrtOfNegativeTest() {
        double result = calculator.sqrt(-81);
        Assert.assertEquals(message, NaN, result, 0);
    }

    @Test
    public void sqrtOfPositiveTest() {
        double result = calculator.sqrt(9);
        Assert.assertEquals(message, 3, result, 0);
    }
    @Test
    public void sqrtOfZeroTest() {
        double result = calculator.sqrt(0);
        Assert.assertEquals(message, 0, result, 0);
    }
    @Test
    public void sqrtOfFractionalPositiveTest() {
        double result = calculator.sqrt(11.5);
        Assert.assertEquals(message, 3.3912, result, 0);
    }

    @Test
    public void percentTest() {
        double result = calculator.percent(10,20);
        Assert.assertEquals(message, 2, result, 0);
    }

    @Test
    public void powPositiveInPositiveDegreeTest(){
        double result = calculator.pow(2,6);
        Assert.assertEquals(message, 64, result, 0);
    }

    @Test
    public void powNegativeInPositiveDegreeTest(){
        double result = calculator.pow(-3,5);
        Assert.assertEquals(message, -243, result, 0);
    }

    @Test
    public void powPositiveInNegativeDegreeTest(){
        double result = calculator.pow(2,-3);
        Assert.assertEquals(message, 0.125, result, 0);
    }

    @Test
    public void powFractionalNegativeInPositiveDegreeTest(){
        double result = calculator.pow(-1.6,4);
        Assert.assertEquals(message, 6.5536, result, 0);
    }

    @Test
    public void powPositiveInFractionalPositiveDegreeTest(){
        double result = calculator.pow(12,0.8);
        Assert.assertEquals(message, 7.3004, result, 0);
    }

    @Test
    public void powZeroDegreeTest(){
        double result = calculator.pow(-1005,0);
        Assert.assertEquals(message, 1, result, 0);
    }

    @Test
    public void powZeroInPositiveDegreeTest(){
        double result = calculator.pow(0,299);
        Assert.assertEquals(message, 0, result, 0);
    }
    }