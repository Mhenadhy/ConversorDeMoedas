package Conversor;

public class PaisMoeda {
    private String chave = "https://v6.exchangerate-api.com/v6/483d83d4ca78e87e75696886";
    private String dollarParaReal = "pair/USD/BRL/";
    private String realParaDollar = "pair/BRL/USD/";
    private String realParaIene = "pair/BRL/JPY/";
    private String ieneParaReal = "pair/JPY/BRL/";
    private String realParaPesoChileno = "pair/BRL/CLP/";
    private String pesoChilenoParaReal = "pair/CLP/BRL/";

    public String getChave() {
        return chave;
    }

    public String getRealParaPesoChileno() {
        return realParaPesoChileno;
    }

    public String getPesoChilenoParaReal() {
        return pesoChilenoParaReal;
    }

    public String getRealParaDollar() {
        return realParaDollar;
    }

    public String getRealParaIene() {
        return realParaIene;
    }

    public String getIeneParaReal() {
        return ieneParaReal;
    }

    public String getDollarParaReal() {
        return dollarParaReal;
    }
}
