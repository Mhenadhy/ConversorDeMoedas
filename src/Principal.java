import Conversor.MaquinaDeConverder;
import Conversor.Moedas;
import Conversor.PaisMoeda;
import com.google.gson.Gson;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Gson gson = new Gson();
        var paisMoeda = new PaisMoeda();
        var conversor = new MaquinaDeConverder();
        var leitura = new Scanner(System.in);
        var opcao = 0;

        while(opcao != 7){
            System.out.println("***************************************************");
            System.out.println("Seja bem-vindo(a) ao conversor de moedas");
            System.out.println();
            System.out.println("""
                    1)Real ==> Dolar
                    2)Dolar ==> Real
                    3)Real ==> Iene
                    4)Iene ==> Real
                    5)Real ==> Peso Chileno
                    6)Peso Chileno ==> Real
                    7)Sair
                    Escolha uma opção válida:               
                    """);
            System.out.println("***************************************************");
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Digite 0 valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getRealParaDollar() + valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 2) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getDollarParaReal() + valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 3) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getRealParaIene() + valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 4) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getIeneParaReal() + valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 5) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getRealParaPesoChileno() +valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 6) {
                System.out.println("Digite o valor: ");
                double valor = leitura.nextDouble();
                var json = conversor.obederDados(paisMoeda.getChave() + paisMoeda.getPesoChilenoParaReal() + valor);
                Moedas moedas = gson.fromJson(json, Moedas.class);
                System.out.println(moedas);
            } else if (opcao == 7) {
                System.out.println("Encerrando programa!");
            } else {
                System.out.println("Por favor digite uma opção valida");
            }
        }
    }
}