package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        int sum = decA + decB;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        int mult = decA * decB;
        return Integer.toBinaryString(mult);
    }
}
