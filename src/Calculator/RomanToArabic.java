package Calculator;

class RomanToArabic {
    static String[] Rome = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] Arab = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    public int romanToArab(String rome) {

        StringBuilder romeNumber = new StringBuilder(rome);
        int arabNumber = 0, i = 0; // Проверяем переданную строку на наличие символов
        if (romeNumber.length() > 0) {
            while (true) {
                do {
                    if (Rome[i].length() <= romeNumber.length()) { // Выделяем из строки подстроку и сравниваем со значением из массива Rome
                        if (Rome[i].equals(romeNumber.substring(0,
                                Rome[i].length()))) { // После чего прибавляем число соответствующее индексу элемента римской цифры из массива Arab
                            arabNumber += Arab[i];  // и удаляем из строки римскую цифру
                            romeNumber.delete(0, Rome[i].length());
                            if (romeNumber.length() == 0)
                                return arabNumber;
                        } else
                            break;
                    } else
                        break;
                } while (romeNumber.length() != 0);
                i++;
            }
        }
        return 0;
    }


}
