package guru.qa;

public class Main {
    public static void main(String[] args) {

        // Целочисленные типы
        byte aByte = 0; // 8bit -128 +127
        short aShort = 0; // 16bit -32768 +32767
        int aInt = 0; // 32bit (-2^32) .. (+2^32 -1) -14
        long aLong = 0; // 64bit

        // Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;

        // Символьный тип
        char aChar = 'a';

        // Логический тип
        boolean aBoolean = true;

        //Строка
        String toBePrint = "Hello world!";

        class Cup {
            String color = "grey";
            int capacity = 250;
            boolean hasHandle = true;
        }

        System.out.println(toBePrint);
    }
}