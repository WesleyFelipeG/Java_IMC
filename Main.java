import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Dados d = new Dados();

    System.out.println("Digite o peso: ");
    d.setPeso(sc.nextDouble());

    System.out.println("Digite a altura: ");
    d.setAltura(sc.nextDouble());

    d.calcularImc();
    System.out.println("Peso:" + d.getPeso()+ " Altura:" + d.getAltura());

    }
}