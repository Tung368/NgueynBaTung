package arrays;
public class quickarray {
    public static void main(String[] args) {
        int [] numbers = {12,49,-2,26,5,17,-6};
        for (int i= 1; i<numbers.length;i++){
            numbers[i]= 2*i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        }
    }
