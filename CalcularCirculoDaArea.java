import java.util.Scanner;

public class CalcularCirculoDaArea {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A area do circulo é: " + area);

        sc.close();
    }
}
