package Calculator;

public class ArabToRoma {
    public static String arabToRoman(int result) {
        if (result < 1 || result > 100) {
            return "throws Exception";
        }
        String s = "";
        while (result >= 100) {
            s += "C";
            result -= 100;
        }
        while (result >= 90) {
            s += "XC";
            result -= 90;
        }
        while (result >= 50) {
            s += "L";
            result -= 50;
        }
        while (result >= 40) {
            s += "XL";
            result -= 40;
        }
        while (result >= 10) {
            s += "X";
            result -= 10;
        }
        while (result >= 9) {
            s += "IX";
            result -= 9;
        }
        while (result >= 5) {
            s += "V";
            result -= 5;
        }
        while (result >= 4) {
            s += "IV";
            result -= 4;
        }
        while (result >= 1) {
            s += "I";
            result -= 1;
        }
        return s;
    }
}


