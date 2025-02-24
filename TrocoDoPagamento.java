import  java.util.Scanner;
public class TrocoDoPagamento {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("O preço unitario do produto: ");
        double Preço = sc.nextDouble();

        System.out.println("Quantidade de compra: ");
        int Compra = sc.nextInt();

        System.out.println("O dinheiro recebido: ");
        double Dinheiro = sc.nextDouble();

        double total = Preço * Compra;
        double troco = Dinheiro - total;

        System.out.printf("A quantidade de compra é:  %.2f%n",total);
        System.out.printf("O troco a ser devolvida é: %.2f%n",troco);

        sc.close();
    }
}
