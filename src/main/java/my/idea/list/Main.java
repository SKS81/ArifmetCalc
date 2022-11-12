package my.idea.list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Вас приветствует программа Калькулятор");
        System.out.println();
        System.out.println("Введите номер требуемого действия:");
        System.out.println("1 - если требуется сложение");
        System.out.println("2 - если требуется вычитание");
        System.out.println("3 - если требуется умножение");
        System.out.println("4 - если требуется деление");
        System.out.println("5 - если требуется найти квадратный корень");
        System.out.println("6 - если требуется возвести в степень");
        int change = console.nextInt();
        if (change == 1) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите первое слагаемое:");
            float a = console.nextFloat();
            System.out.println("Введите второе слагаемое:");
            float b = console.nextFloat();
            float rez1 = service.get1Plus(a, b);
            System.out.println();
            System.out.println("Решение:");
            System.out.println(a + " прибавить " + b + " равно " + rez1);
            System.exit(0);
        } if (change == 2) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите уменьшаемое:");
            float c = console.nextInt();
            System.out.println("Введите вычитаемое:");
            float d = console.nextInt();
            float rez2 = service.get2Minus(c, d);
            System.out.println();
            System.out.println("Решение:");
            System.out.println(c + " вычесть " + d + " равно " + rez2);
            System.exit(0);
        } if (change == 3) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите первый множитель:");
            float i = console.nextInt();
            System.out.println("Введите второй множитель:");
            float f = console.nextInt();
            float rez3 = service.get3Multiplication(i, f);
            System.out.println();
            System.out.println("Решение:");
            System.out.println(i + " умножить " + f + " равно " + rez3);
            System.exit(0);
        } if (change == 4) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите делимое:");
            float g = console.nextInt();
            System.out.println("Введите делитель:");
            float h = console.nextInt();
            float rez4 = service.get4Division(g, h);
            System.out.println();
            System.out.println("Решение:");
            System.out.println(g + " разделить " + h + " равно " + rez4);
            System.exit(0);
        } if (change == 5) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите число, квадратный корень которого нужно найти:");
            float j = console.nextInt();
            float rez5 = service.get5Sqrt(j);
            System.out.println("Решение:");
            System.out.println("Квадратный корень из " + j + " равен " + rez5);
            System.exit(0);
        } if (change == 6) {
            CalculateService service = new CalculateService();
            System.out.println("Если числа дробные, используйте запятую.");
            System.out.println("Введите число, возводимое в степень:");
            float k = console.nextInt();
            System.out.println("Введите степень возведения:");
            float l = console.nextInt();
            float rez6 = service.get6Degree(k, l);
            System.out.println("Решение:");
            System.out.println(k + " в степени " + l + " равно " + rez6);
            System.exit(0);
        } else {
            System.out.println();
            System.out.println("Вы указали некорректное значение.");
            System.out.println("Перезапустите программу и повторите ввод");
            System.exit(0);
        }
    }
}