import java.util.Scanner;

public class IdadeMediaDeUmaPessoa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa 1: ");
        String Nome1 = sc.nextLine();

        System.out.println("Digite a idade da pessoa 1: ");
        int Idade1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome da pessoa 2: ");
        String Nome2 = sc.nextLine();

        System.out.println("Digite a idade da pessoa 2: ");
        int Idade2 = sc.nextInt();

        double IdadeMedia = ( Idade1 + Idade2 ) / 2.0;

        System.out.println("A idade media da pessoa é: " + IdadeMedia);

        sc.close();
    }
}