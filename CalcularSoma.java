import java.util.Scanner;

public class CalcularSoma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int ValorDeX = sc.nextInt();

        System.out.println("Digite o valor de y: ");
        int ValorDeY = sc.nextInt();

        int Soma = ValorDeX + ValorDeY;

        System.out.println("A soma é: " + Soma);

        sc.close();
    }
}
