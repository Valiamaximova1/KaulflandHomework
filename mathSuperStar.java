package kaufland;

import java.util.Scanner;

public class mathSuperStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(",");
        double r1 = Double.parseDouble(array[0]);
        double h1 = Double.parseDouble(array[1]);
        double r2 = Double.parseDouble(array[2]);
        double h2 = Double.parseDouble(array[3]);

        double V1 = (Math.PI * r1 * r1 * h1)/1000;
        double V2 = (Math.PI * r2 * r2 * h2)/1000;
        if(Math.abs(V1 -V2) < 0.001){
            System.out.printf("V1 = V2 = %.2f\n", V2);
        }else{
            double bigger = Math.max(V1,V2);
            System.out.printf("%.2f",bigger);
        }
    }
}
