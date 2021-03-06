
/*
9.	Сума от две числа
        Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
        На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
        Ако няма нито една комбинация отговаряща на условието се печата съобщение, че не е намерено.
        Вход
        Входът се чете от конзолата и се състои от три реда:
        •	Първи ред – начало на интервала – цяло число в интервала [1...999]
        •	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        •	Трети ред – магическото число – цяло число в интервала [1...10000]
        Изход
        На конзолата трябва да се отпечата един ред, според резултата:
        •	Ако е намерена комбинация чиито сбор на числата е равен на магическото число
        o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
        •	Ако не е намерена комбинация отговаряща на условието
        o	"{броят на всички комбинации} combinations - neither equals {магическото число}"
*/


package L08_More_Nested_Loops;

import java.util.Scanner;

public class p9Сума_от_две_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}
