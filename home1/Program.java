package home1;

import java.util.ArrayList;

public class Program {

    // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randomNum(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }

    // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }

    //  Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

    // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int min = 1, max = 2000;
        int i = randomNum(min, max);
        System.out.println("Целое число между " + min + " и " + max + ": i = " + i);
        int n = seniorBit(i);
        System.out.println("Номер старшего значащего бита из i: n = " + n);
        ArrayList<Integer> m1 = arrayMult(i, n, max);
        ArrayList<Integer> m2 = arrayNotMult(i, n, min);
        saveArray(m1, "home1/m1.txt");
        saveArray(m2, "home1/m2.txt");
    }

    private static void saveArray(ArrayList<Integer> m1, String string) {
    }
}