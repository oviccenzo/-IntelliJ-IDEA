import java.util.Scanner;

public class LerDuraçãoDoTempo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração em segundos: ");
        int DuraçãoSegundo = sc.nextInt();

        int hora = DuraçãoSegundo / 3600;
        int minuto = (DuraçãoSegundo % 3600) / 60;
        int segundo = DuraçãoSegundo % 60;

        System.out.printf(" %d:%02d:%02d%n ",hora,minuto,segundo);
    }
}
