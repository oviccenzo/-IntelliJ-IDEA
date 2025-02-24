import java.util.Scanner;

public class ConsumoMediaDeCombustivel {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("A distancia percorrido por km: ");
        double Distancia = sc.nextDouble();

        System.out.println("O combustivel gasto (em litro): ");
        double Combustivel = sc.nextDouble();

        double ConsumoMedio = Distancia / Combustivel;

        System.out.printf("O consumo de combustivel gasto é: %.3f%n" , ConsumoMedio);

        sc.close();
    }
}
