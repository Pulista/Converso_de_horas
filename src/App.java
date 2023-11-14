import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Coletar dados
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os minutos: ");
        double minutos = scan.nextDouble();

        // Conversão de minutos para horas
        double horas = minutos / 60;
        int horasMin = (int) horas;
        int minutosMin = (int) ((horas - horasMin) * 60);

        // Exibir o resultado
        System.out.println("O resultado é: " + horasMin + " horas e " + minutosMin + " minutos");
        // ou
        System.out.println("O resultado é: " + horas + " horas");

        scan.close();
    }
}
