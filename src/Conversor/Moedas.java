package Conversor;

public record Moedas(String result, String base_code, String conversion_result, String target_code) {
    @Override
    public String toString() {
        return "De: " + "[" + base_code + "] " + "Para " + "[" + target_code + "] " + "= " + conversion_result.substring(0,5);
    }
}
