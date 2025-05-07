package desafio;

public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculo_atual = null;
    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public void atribuir_veiculo(Veiculo veiculo){
        if(veiculo_atual != null){
            System.out.println("Motorista já possui veículo atribuído");
        } else this.veiculo_atual = veiculo;
    }

    public void remover_veiculo(){
        this.veiculo_atual = null;
    }

    public void dirigir(){
        if(this.veiculo_atual !=null){
            System.out.println("Nome do motorista: " + getNome() + " Veiculo: " + getVeiculo_atual().exibir_info());
        } else System.out.println("Nome do motorista: " + getNome());

    }

    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculo_atual() {
        return veiculo_atual;
    }
}
