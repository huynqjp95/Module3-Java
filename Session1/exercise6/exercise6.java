package Session1.exercise6;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width = ");
        float width = sc.nextFloat();
        System.out.print("Input hight = ");
        float hight = sc.nextFloat();
        sc.close();
        float area = width * hight;
        float circumference = (width + hight)*2;
        System.out.printf("width = %f , height = %f%n",width, hight);
        System.out.printf("area : %.2f%nCircumference : %.2f",area, circumference);

    }
}
