package desafio;

import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> veiculos;
    ArrayList<Motorista> motoristas;

    public void adicionar_veiculo(Veiculo  veiculo){
        veiculos.add(veiculo);
    }

    public void adicionar_motorista(Motorista motorista){
        motoristas.add(motorista);
    }

    public void listar_frota(){
        if(veiculos.isEmpty() && motoristas.isEmpty()){
            System.out.println("Não há motoristas e veiculos adicionados");
        }else {
            for (int i = 0; i < veiculos.size(); i++) {
                System.out.println(veiculos.get(i));
            }
            for (int i = 0; i < motoristas.size(); i++) {
                System.out.println(motoristas.get(i));
            }
        }
    }
}
