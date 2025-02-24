import java.util.Scanner;

public class PagamentoDoFuncionario {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome de um(a) funcionário(a):  ");
        char nome = sc.next().charAt(0);

        System.out.println("Calcular valor por hora: ");
        double ValorPorHora = sc.nextDouble();

        System.out.println("Calcular valor trabalhada: ");
        int HoraTrabalhada = sc.nextInt();

        double Pagamento = ValorPorHora * HoraTrabalhada;

        System.out.println("O pagamento do funcionario(a) deve ser: " + Pagamento);

        sc.close();
    }
}
