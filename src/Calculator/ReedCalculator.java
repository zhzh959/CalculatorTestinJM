package Calculator;

import java.util.Scanner;

public class ReedCalculator {

    private int x;
    private int y;
    private char operation; // объявляем переменные

    public void read() {

        Scanner scanner = new Scanner(System.in); // создаем объект сканер для считывания с клавиатуры
        ArabicToRoman arabicToRoman = new ArabicToRoman(); // для конвертации цифр
        String expression = scanner.nextLine(); // сканер считывает строку

        try {
            String[] blocks = expression.split("[+-/*]");
            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            boolean flag = false;
            for (String s : roman) {
                if (s.equals(blocks[0]) || s.equals(blocks[1])) {
                    flag = true;
                }
                if (flag) {
                    x = arabicToRoman.romanToArab(blocks[0]);
                    y = arabicToRoman.romanToArab(blocks[1]);

                } else {
                    x = Integer.parseInt(blocks[0]);
                    y = Integer.parseInt(blocks[1]);
                }

                operation = expression.charAt(blocks[0].length());

                if ((x > 10 || x < 1) || (y > 10 || y < 1)) {
                throw new IllegalArgumentException();
            }
        }

        }catch (RuntimeException e){
                throw new IllegalArgumentException("Неверный формат данных \nInput:");
            }

    }
    public int getVar1() {
        return x;
    }

    public int getVar2() {
        return y;
    }

    public char getOper() {
        return operation;
    }
}