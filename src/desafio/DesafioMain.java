package desafio;

public class DesafioMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mitsubishi", "Pajero Sport", 2023, 4);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", 2020, 80);

        Motorista driver = new Motorista("Tales", "12345221");
        driver.atribuir_veiculo(carro1);
        driver.remover_veiculo();
        driver.atribuir_veiculo(caminhao1);

        Frota frotaUber = new Frota();
        frotaUber.adicionar_motorista(driver);
        frotaUber.adicionar_veiculo(carro1);
        frotaUber.adicionar_veiculo(caminhao1);

        carro1.acelerar();

        System.out.println(carro1.exibir_info());
        System.out.println(caminhao1.exibir_info());

        driver.dirigir();

        frotaUber.listar_frota();


    }
}
