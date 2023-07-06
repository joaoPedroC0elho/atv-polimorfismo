import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (1 - Carro, 2 - Moto, 0 - Sair):");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }

            Veiculo veiculo;
            if (opcao == 1) {
                veiculo = new Carro();
            } else if (opcao == 2) {
                veiculo = new moto();
            } else {
                System.out.println("Opção inválida!");
                continue;
            }

            veiculo.inserirDados();
            veiculos.add(veiculo);
        }

        System.out.println("Relatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.imprimirRelatorio();
            System.out.println();
        }

        double totalPreco = 0;
        for (Veiculo veiculo : veiculos) {
            totalPreco += veiculo.getPreco();
        }
        System.out.println("Total de Preços: R$" + totalPreco);

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof moto && ((moto) veiculo).getAno() >= 2008) {
                veiculo.setpreco(veiculo.getPreco() * 1.1);
            } else if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                veiculo.setpreco(veiculo.getPreco() * 0.92);
            }
        }

        double novoTotalPreco = 0;
        for (Veiculo veiculo : veiculos) {
            novoTotalPreco += veiculo.getPreco();
        }
        System.out.println("Novo Total de Preços: R$" + novoTotalPreco);
    }
}
