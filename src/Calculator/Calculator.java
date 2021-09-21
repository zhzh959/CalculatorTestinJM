package Calculator;

class Calculator {

    public static int calculate(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                try {
                    result = number1 / number2;
                } catch (ArithmeticException e) {}
                break;
            default:
                throw new IllegalArgumentException("Неверный знак операции");
        }

        return result;

    }
}

