package ilzira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]mars = new int[5];
        mars[0] = 4;
        int[]luna;
        Main main = new Main();
        System.out.println(main.initializeArray());


    }
   public int initializeArray(){
        int[]count = new int[20];
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int max = 0;
        for (int i = 0;i <count.length;i++) {
            int b = scanner.nextInt();
             count[i] = count[i] = b;
        if (max>count[i]){
            max = count[i];
        }
        }
        return  max;
    }
}

