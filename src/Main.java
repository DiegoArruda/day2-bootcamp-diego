import exercicio1.Imc;
import exercicio3.Cpf;

public class Main {
    public static void main(String[] args) {
        Cpf novoCpf = new Cpf();
        novoCpf.setCpf("12227035480");
        novoCpf.validarCpf(novoCpf.getCpf());


        Imc meuImc = new Imc();
        meuImc.setPeso(70);
        meuImc.setAltura(1.89);
        double imcCalculado = meuImc.calcularIMC(meuImc.getPeso(), meuImc.getAltura());
        System.out.println(Math.round(imcCalculado));

    }
}