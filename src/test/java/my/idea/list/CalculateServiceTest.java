package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {

    @Test
    public void rez1() {
        CalculateService service = new CalculateService();
        float expected = 500;
        float actual = service.get1Plus(200, 300);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez2() {
        CalculateService service = new CalculateService();
        float expected = 200;
        float actual = service.get2Minus(500, 300);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez3() {
        CalculateService service = new CalculateService();
        float expected = 600;
        float actual = service.get3Multiplication(10, 60);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez4() {
        CalculateService service = new CalculateService();
        float expected = 300;
        float actual = service.get4Division(600, 2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez5() {
        CalculateService service = new CalculateService();
        float expected = 100;
        float actual = service.get5Sqrt(10_000);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez6() {
        CalculateService service = new CalculateService();
        float expected = 400;
        float actual = service.get6Degree(20, 2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

}