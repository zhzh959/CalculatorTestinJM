package Calculator;

        public class CalculatorTest {

            public static void main(String[] args) {
                ReedCalculator data = new ReedCalculator();
                System.out.println("Input: ");

                do {
                    try {
                        data.read();
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                        continue;
                    }
                    double result = Calculator.calculate(data.getVar1(), data.getVar2(), data.getOper());
                    System.out.println("Output: ");
                    System.out.println(result);
                    System.out.println("Input");
                } while (true);
            }
    }
