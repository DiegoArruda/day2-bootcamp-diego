package desafio;

public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculo_atual;

    public void atribuir_veiculo(Veiculo veiculo){
        this.veiculo_atual = veiculo;
    }

    public void remover_veiculo(){
        this.veiculo_atual = null;
    }

    public void dirigir(){
        if(this.veiculo_atual !=null){
            System.out.println("Nome do motorista: " + nome + "Veiculo: " + veiculo_atual.getModelo());
        } else System.out.println("Nome do motorista: " + nome);

    }
}
