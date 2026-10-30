package app;

import java.util.ArrayList;
import java.util.List;
import model.Carro;
import model.CarroEletrico;
import model.Moto;
import model.Recarregavel;
import model.Veiculo;

        public class TesteLocadora {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234", "Sedan", 150.0);
        Moto motoQuatroDias = new Moto("DEF-5678", "SUV", 80.0);
        Moto motoCincoDias = new Moto("GHI-9012", "Trator", 80.0);
          CarroEletrico eletrico = new CarroEletrico("JKL-3456", "Eletrico", 200.0, 10.0);

        List<Veiculo> veiculos = new ArrayList<>();
              veiculos.add(carro);
                 veiculos.add(motoQuatroDias);
        veiculos.add(motoCincoDias);
        veiculos.add(eletrico);

        int[] dias = {3, 4, 5, 3};

        System.out.println("=== ALUGUÉIS ===");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
            veiculo.imprimirResumo();
            System.out.printf("Aluguel (%d dias): R$ %.1f%n", dias[i],
                    veiculo.calcularAluguel(dias[i]));
            System.out.println();
        }
        List<Recarregavel> eletricos = List.of(eletrico);
        System.out.println("=== RECARGA ===");
                  for (Recarregavel item : eletricos) {
            System.out.printf("Recarga (3 dias): R$ %.1f%n",
                    item.calcularRecarga(3));
        }
    }
}
