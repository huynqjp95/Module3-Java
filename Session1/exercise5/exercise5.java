package Session1.exercise5;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input the denominator of numerator 1: ");
      int a = sc.nextInt();
      System.out.print("Input the fraction of numerator 1: ");
      int b = sc.nextInt();
      System.out.print("Input the denominator of numerator 2: ");
      int c = sc.nextInt();
      System.out.print("Input the fraction of numerator 1: ");
      int d = sc.nextInt();
      sc.close();
      int denominator = a*d + b*c;
      int fraction = b*d;
      System.out.printf("The numerator 1 : %d/%d, Numerator 2: %d/%d ",a,b,c,d);
      System.out.printf("The result: %d/%d", denominator, fraction);
    }
}
