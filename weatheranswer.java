package arrays;

import java.util.Scanner;

public class weatheranswer {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int [] temps = new int[days];
        int sum = 0;
        for(int i = 0; i<days;i++){
        System.out.print("day"+(i+1)+"'s high temp:'");
        temps[i]=console.nextInt();
        sum += temps[i];
    }
        double average =(double) sum/days;
        int count =0;
        for (int i =0;i<days;i++){
            if (temps[1]>average){
                count++;
            }
        }
        System.out.printf("average tyemp =%.if",average);
        System.out.println("");
        System.out.println(count +"days above average");
        
    }
}
