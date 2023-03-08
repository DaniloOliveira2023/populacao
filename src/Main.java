import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        int ano = 0;
        Scanner s = new Scanner(System.in);
        for (int i=0; a<b; i++) {
            a = a + 0.03;
            b = b + 0.02;
            ano=i;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(ano);
    }
}