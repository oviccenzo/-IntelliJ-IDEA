import java.util.Scanner;

public class CalcularRetangulo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        double Base = sc.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        double Altura = sc.nextDouble();

        double Area = Base * Altura;
        double Perímetro = 2 * (Base + Altura);
        double Diagonal = Math.sqrt(Math.pow(Base,2) + Math.pow(Altura,2));

        System.out.printf("O calculo da area é: %.4f%n",Area);
        System.out.printf("O calculo do perímetro é: %.4f%n",Perímetro);
        System.out.printf("O calculo da diagonal é: %.4f%n", Diagonal);

        sc.close();
    }
}
