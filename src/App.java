import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int peixe;
        int multa;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso do peixe:");

        peixe = teclado.nextInt();

        if (peixe > 50) {

            multa = (peixe - 50) * 4;

            System.out.println("Multa: R$" + multa);
        }

        else {
            System.out.println("Não haverá multa");
        }
    }
}