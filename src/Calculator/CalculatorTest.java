package Calculator;

import java.io.IOException;

public class CalculatorTest {

    public static void main(String[] args) {
        ReadCalculator data = new ReadCalculator();
        ArabToRoma arabicToRoma = new ArabToRoma();
        System.out.println("ВВЕДИТЕ ДАННЫЕ В ФОРМАТЕ: \"2+2\" или \"V/V\" \nInput: ");

        try {
                data.read();
            } catch (RuntimeException | IOException e) {
                System.err.println(e.getMessage());
            }
            if (data.x <= 10 && data.y <= 10 && data.a <= 10 && data.b <= 10) {
                int result = Calculator.calculate(data.x, data.y, data.operation);
                int resultArab = Calculator.calculate(data.a, data.b, data.operation);
                String resultRoman = arabicToRoma.arabToRoman(result);

                if (resultArab != 0) {
                    System.out.println("Output: ");
                    System.out.println(resultArab);
                }
                else {
                    System.out.println("Output: ");
                    System.out.println(resultRoman);
                }

                } else
                    System.out.println("Output:\nthrows Exception");
    }
}