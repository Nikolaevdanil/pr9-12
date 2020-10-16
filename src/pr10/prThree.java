package pr10;

import java.util.Scanner;

public class prThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        f(scanner.nextInt());
    }
    public static void f(int a){
        if(a!=0) {
            f(a / 10);
            System.out.print(a % 10+" ");
        }
    }
}
