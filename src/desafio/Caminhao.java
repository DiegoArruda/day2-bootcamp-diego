package desafio;

public class Caminhao extends Veiculo{
    private float capacidade_carga;

    Caminhao(String marca, String modelo, int ano, float capacidade_carga) {
        super(marca, modelo, ano);
        this.capacidade_carga = capacidade_carga;
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    @Override
    public String exibir_info() {
        return "Veiculo{" +
                "ano=" + getAno() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", velocidade atual='" + getVelocidade() + '\'' +
                ", capacidade de carga ='" + getCapacidade_carga() + '\'' +
                '}';
    }
}
