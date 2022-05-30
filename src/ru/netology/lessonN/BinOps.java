package ru.netology.lessonN;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int strA = Integer.parseInt(a, 2);
        int strB = Integer.parseInt(b, 2);
        int result = strA + strB;
        String strResult = Integer.toBinaryString(result);
        return strResult;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int strA = Integer.parseInt(a, 2);
        int strB = Integer.parseInt(b, 2);
        int result = strA * strB;
        String strResult = Integer.toBinaryString(result);
        return strResult;
    }
}
