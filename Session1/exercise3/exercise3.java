package Session1.exercise3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        System.out.println("Input radius :");
        double radius = sc.nextDouble();
        double area = PI*radius*radius;
        System.out.printf("Bán kính của đường tròn bán kính %f : %.2f", radius, area);
        sc.close();
    }
}
