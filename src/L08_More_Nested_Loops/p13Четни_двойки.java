
/*
13.	Четни двойки
        Напишете програма, която генерира и принтира на конзолата четирицифрени числа, в които първата и втората двойка
        цифри образуват двуцифрени прости числа (пример за такова число 1723).
        Крайната стойност до която трябва да се генерират двойките се определя от други 2 цифри, подадени като вход,
        които определят с колко крайната стойност е по-голяма от началната.
        Вход
        От конзолата се четат четири реда:
        •	На първия ред – началната стойност на първите първата двойка числа –
        цяло положително число в диапазона [10… 90]
        •	На втория ред – началната стойност на втората двойка числа – цяло положително число в диапазона [10… 90]
        •	На третия ред – разликата между началната и крайната стойност на  първата двойка числа –
        цяло положително число в диапазона [1… 9]
        •	На четвъртия ред – разликата между началната и крайната стойност на  втората двойка числа –
        цяло положително число в диапазона [1… 9]
        Изход:
        Да се отпечатат на конзолата четирицифрените числа, в които първите две и вторите две цифри са
        прости двуцифрени числа.
*/


package L08_More_Nested_Loops;

import java.util.Scanner;

public class p13Четни_двойки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int m1 = Integer.parseInt(scanner.nextLine());
        int m2 = Integer.parseInt(scanner.nextLine());

        int max1 = n1+m1;
        int max2 = n2+m2;
        int count1;
        int count2;

        for (int i = n1; i <= max1; i++) {
            count1 = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {

                for (int j = n2; j <= max2; j++) {
                    count2 = 0;
                    for (int l = 1; l <= j; l++) {
                        if (j % l == 0) {
                            count2++;
                        }
                    }
                    if (count2 == 2) {
                        System.out.printf("%d%d",i,j);
                        System.out.println();
                    }
                }
            }
        }
    }
}