import java.util.Scanner;

public class LerTrêsNumeroDeMedidaDeLado {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida de A: ");
        double MedidaA = sc.nextDouble();

        System.out.println("Digite a medida de B: ");
        double MedidaB = sc.nextDouble();

        System.out.println("Digite a medida de C: ");
        double MedidaC = sc.nextDouble();

        double AreaDoQuadrado = MedidaA * MedidaA;
        double AreaDoTriangulo = (MedidaA * MedidaC) / 2;
        double AreaDoTrapézio = ((MedidaA + MedidaB) * MedidaC) / 2;
        
        System.out.printf("A área do quadrado é: %.4f%n", AreaDoQuadrado);
        System.out.printf("A área do triangulo é: %.4f%n", AreaDoTriangulo);
        System.out.printf("A area do trapezio é: %.4f%n", AreaDoTrapézio);

        sc.close();
    }
}
