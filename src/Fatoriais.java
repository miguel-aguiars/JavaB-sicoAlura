import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int num = input.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }
}