package exercicio4;

public class Produto {
    private double preco;

    public double aplicarDesconto(double preco, double desconto){
        return preco - (desconto*preco/100);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
