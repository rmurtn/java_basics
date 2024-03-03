package guru.qa_1;

import java.util.List;

public class JavaBasicsFirst {
    public static void main(String[] args) {

        // Целочисленные типы
        byte aByte = 0; // 8bit -128 +127 (-2^(8-1)) .. (+2^(8-1))-1
        short aShort = 0; // 16bit -32768 +32767 (-2^(16-1)) .. (+2^(16-1))-1
        int aInt = 0; // 32bit (-2^(32-1)) .. (+2^(32-1))-1 -14
        Integer intWrapper = 0;
        long aLong = 0; // 64bit (-9 * 10^18) .. (9 * 10^18)

        // Типы с плавающей точкой
        float aFloat = 0.0F; // 32bit
        double aDouble = 0.0; // 64bit
        Double doubleWrapper = 9.1;
        // Символьный тип
        char aChar = 'a';
        Character charWrapper = 'a';
        // Логический тип
        boolean aBoolean = true;
        Boolean booleanWrapper = true;

        //Строка(и бесконечность других объектных/ссылочных типов)
        String toBePrint = "Hello world!";
        System.out.println(toBePrint);

        List<String> teachers = List.of("Stan", "Dmitri");

        class Cup {
            String color = "grey";
            int capacity = 250;
            boolean hasHandle = true;
        }

        //Операторы
        //Оператор присвоения =
        String nameFirst = "Dmitri";
        int age = 34;
        String nameSecond = "Stan";
        String nameThird = null;
        //Арифметический оператор + - / * % ++ --
        System.out.println(4.0 + 3);
        System.out.println(4.0 - 3);
        System.out.println(4.0 / 3);
        System.out.println(4.0 * 3);
        System.out.println(4.0 % 3);

//        int result = aInt + 1;
//        int result = ++aInt; //префиксная запись
        int result = aInt++; //постфиксная запись

//        int result = aInt - 1;
//        int result = --aInt;
        System.out.println(result);

        //Операторы сравнения <, >, >=, <=, !=, ==
        System.out.println(3 > 2);
        System.out.println(3 >= 2);
        System.out.println(3 >= 2);
        System.out.println(3 != 2);
        System.out.println(3 == 2);

        System.out.println(nameFirst.equals(nameSecond));

        //Логические операторы &, |, &&, ||, !

        System.out.println(nameFirst.equals("Dmitri") && age == 34);

        if (nameThird != null && nameThird.length() == 5) {
            System.out.println("Success");
        }

//        System.out.println(nameFirst.equals("Dmitri") || age == 77);

        //Оператор instanceof
        System.out.println(nameFirst instanceof String);

        //Тернарный оператор

        char sex = 'M';

        String childName = sex == 'M'
                ? "Alex"
                : "Alexa";

        // Управляющая конструкция if

        if (sex == 'M') {
            childName = "Alex";
        } else {
            childName = "Alexa";
        }

        //ключевое слово new

        String name = new String("Alex");
//        String name = "Alex";


    }
}