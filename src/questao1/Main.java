package questao1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso VIP");
        System.out.println("3 - Ingresso Camarote");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o valor do ingresso normal: R$");
                double valorNormal = scanner.nextDouble();
                Normal ingressoNormal = new Normal(valorNormal);
                ingressoNormal.imprimirValor();
                break;
            case 2:
                System.out.print("Digite o valor do ingresso VIP: R$");
                double valorVIP = scanner.nextDouble();
                System.out.print("Digite o valor adicional do ingresso VIP: R$");
                double adicionalVIP = scanner.nextDouble();
                VIP ingressoVIP = new VIP(valorVIP, adicionalVIP);
                ingressoVIP.imprimirValor();
                break;
            case 3:
                System.out.print("Digite o valor do ingresso Camarote: R$");
                double valorCamarote = scanner.nextDouble();
                System.out.print("Digite o valor adicional do ingresso Camarote: R$");
                double adicionalCamarote = scanner.nextDouble();
                System.out.print("Digite a localização do camarote: ");
                String localizacaoCamarote = scanner.next();
                Camarote ingressoCamarote = new Camarote(valorCamarote, adicionalCamarote, localizacaoCamarote);
                ingressoCamarote.imprimirValor();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}