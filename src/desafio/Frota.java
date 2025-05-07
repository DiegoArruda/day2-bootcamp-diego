package desafio;

import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;

    public Frota() {
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
    }

    public void adicionar_veiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void adicionar_motorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void listar_frota() {
        if (veiculos.isEmpty() && motoristas.isEmpty()) {
            System.out.println("Não há motoristas e veiculos adicionados");
        } else {
            if (veiculos.isEmpty()) {
                System.out.println("Nenhum veículo adicionado.");
            } else {
                System.out.println("Veículos na Frota ");
                for (Veiculo veiculo : veiculos) {
                    System.out.println(veiculo.exibir_info());
                }
            }

            if (motoristas.isEmpty()) {
                System.out.println("Nenhum motorista adicionado.");
            } else {
                System.out.println("Motoristas na Frota ");
                for (Motorista motorista : motoristas) {
                    System.out.println(motorista.getNome());
                }
            }
        }
    }
}
