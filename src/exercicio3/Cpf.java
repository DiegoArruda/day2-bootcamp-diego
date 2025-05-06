package exercicio3;

public class Cpf {
    private String cpf;

    public void validarCpf(String cpf){
        System.out.println((cpf.length() == 11) ? "CPF válido" : "CPF inválido" );
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
