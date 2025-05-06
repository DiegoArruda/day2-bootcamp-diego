package desafio;

public class Carro extends Veiculo{
    private int num_portas;

    Carro(String marca, String modelo, int ano, int num_portas) {
        super(marca, modelo, ano);
        this.num_portas = num_portas;
    }

    public int getNum_portas() {
        return num_portas;
    }


    @Override
    public String exibir_info() {
        return "Veiculo{" +
                "ano=" + getAno() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", velocidade atual='" + getVelocidade() + '\'' +
                ", número de portas='" + getNum_portas() + '\'' +
                '}';
    }
}
