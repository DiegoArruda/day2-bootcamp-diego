package exercicio1;

public class Imc {
    private double peso;
    private double altura;

    public double calcularIMC(double peso,double altura){
        return peso/Math.pow(altura,2) ;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
