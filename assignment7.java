package assignment7;

import java.util.Scanner;
import java.util.ArrayList;

public class assignment7 {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    public static float findMax2(float[] arrays) {
        float max1 = Float.NEGATIVE_INFINITY, max2 = Float.NEGATIVE_INFINITY;
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> resultList = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0.0) {
                resultList.add(arrays[i]);
                System.out.println("number[" + i + "]=" + arrays[i] + " la so chan");
            }
        }
        float[] resultArray = new float[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();
        float[] arrays = new float[size];

        arrays = importData(arrays);

        printData(arrays);

        float max2 = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang: " + max2);

        float[] evenArray = deleteOddNumber(arrays);
        System.out.print("Mang sau khi xoa cac phan tu le: ");
        printData(evenArray);
    }
}
