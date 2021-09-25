package L06_While_Loops;

import java.util.Scanner;

//Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
//На първия ред ще получите името на ученика, а на всеки следващ ред неговите годишни оценки.
//Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00.
//Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва,
//като се отпечатва името на ученика и в кой клас бива изключен.
//
//При успешно завършване на 12-ти клас да се отпечата
//
//"(име на ученика) graduated. Average grade: (средната оценка от цялото обучение "
//
//В случай, че ученикът е изключен от училище, да се отпечата:
//
//"(име на ученика) has been excluded at (класа, в който е бил изключен) grade"
//
//Стойността трябва да бъде форматирана до втория знак след десетичната запетая.

public class p8_While_continue_Завършване_средна_оценка {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int klas=1;
        int countLoshiOcenki = 0;
        double sumOcenki =0;
        while (klas<=12){
            Double ocenka = Double.parseDouble(scanner.nextLine());
            if (ocenka<4){
                countLoshiOcenki++;
                if (countLoshiOcenki==2){
                    break;
                }
                continue; //
        }
            sumOcenki+=ocenka;
            klas++;

        } // свършва цикъла
        if (countLoshiOcenki==2){
        String out = "%s has been excluded at %d grade"+name+klas;
            System.out.println(out);

        } else {
            Double avg= sumOcenki/12;
            System.out.printf("%s graduated. Average grade: %.2f",name,avg );

        }
  }
}