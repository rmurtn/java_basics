package guru.qa;

public class PracticeJavaBasics {
    public static void main(String[] args) {

//      0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        // Целочисленные типы
        byte aByte = 0; // 8bit -128 +127 (-2^(8-1)) .. (+2^(8-1))-1
        short aShort = 0; // 16bit -32768 +32767 (-2^(16-1)) .. (+2^(16-1))-1
        int aInt = 0; // 32bit (-2^(32-1)) .. (+2^(32-1))-1
        long aLong = 0; // 64bit (-9 * 10^18) .. (9 * 10^18)

        // Типы с плавающей точкой
        float aFloat = 0.0F; // 32bit (-3.4 * 10^38) .. (3.4 * 10^38)
        double aDouble = 0.0; // 64bit (+-1.7 * 10^308) .. (+-4.9 * 10^-324)
        // Символьный тип
        char aChar = 'a';
        // Логический тип
        boolean aBoolean = true;



//      1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
//      посмотреть результаты (вывести в консоль)

        byte bByte = 24;
        short sShort = 48;
        int iInt = 96;
        long lLong = 192;

        float fFloat = 384.23F;
        double dDouble = 768.432;

        //Переполнение
         byte h = (byte) iInt;

        //Арифметический оператор + - / * % ++ --

        int a = 13;
        int b = 13;
        int c = 14;
        int g = 2342423;

        System.out.println(a++);
        System.out.println(a++);
        System.out.println("a++ = " + a++);
        System.out.println(a--);
        System.out.println(a--);
        System.out.println(a--);
        System.out.println(a--);

        System.out.println("--a = " + --a);
        System.out.println(--a);
        System.out.println(--a);

        System.out.println("a + b" + (a + b));
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));

        //Логические операторы &, |, &&, ||, !

        boolean d = true;
        boolean f = false;

        System.out.println("d && f = " + (d && f));

        System.out.println("d || f = " + (d || f));

        System.out.println("!(d && f) = " + !(d && f));

        System.out.println(a > c || b > c);
        System.out.println(a > c && b > c);
        System.out.println(c > b && c > a);
        System.out.println(c > b && !(c > a));


//      2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("double + int = " + dDouble + a);
        System.out.println("double + int = " + dDouble + g);
        System.out.println("double + int = " + dDouble * a);
        System.out.println("double + int = " + dDouble / a);
        System.out.println("double + int = " + dDouble % a);

    }
}
