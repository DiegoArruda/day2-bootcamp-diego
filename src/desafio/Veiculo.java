package desafio;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade = 0;

    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public float acelerar(){
        return this.velocidade += 10;
    }

    public float frear(){
        if(this.velocidade >= 10){
            return this.velocidade -= 10;
        } else return this.velocidade = 0;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocidade() {
        return velocidade;
    }


    public String exibir_info() {
        return "Veiculo:" +
                " ano - " + getAno()+
                ", modelo - '" + getModelo() + '\'' +
                ", marca - '" + getMarca() + '\'' +
                ", velocidade atual - '" + getVelocidade() + " km/h" + '\''
                ;
    }
}
