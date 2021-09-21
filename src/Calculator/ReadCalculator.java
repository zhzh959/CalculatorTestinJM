package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IllegalFormatConversionException;

public class ReadCalculator {

    public static int x;
    public static int y;
    public int a;
    public  int b;
    public static char operation; // объявляем переменные
    private IllegalFormatConversionException e;

    public void read() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// создаем объект для считывания с клавиатуры
        String expression = br.readLine();// сканер считывает строку
        RomanToArabic romanToArabic = new RomanToArabic(); // для конвертации римских цифр

        try {
            String[] blocks = expression.split("[+-/*]"); // выделяем/разделяем подстроку из массива
            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            boolean flag = false;

                   if (Arrays.asList(roman).contains(blocks[0]) || Arrays.asList(roman).contains(blocks[1])) {
                       flag = true;
                   }
                   if (flag) {
                       x = romanToArabic.romanToArab(blocks[0]);
                       y = romanToArabic.romanToArab(blocks[1]);

                   } else {
                       a = Integer.parseInt(blocks[0]);
                       b = Integer.parseInt(blocks[1]);
                   }

                   operation = expression.charAt(blocks[0].length());

               }
                   catch (RuntimeException e) {
                       System.err.println(e.getMessage());
                   }
    }

}


