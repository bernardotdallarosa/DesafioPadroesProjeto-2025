public class Matricula implements Strategy{

    public boolean tipo(String valor){
        if (!valor.matches("\\d+")){
                    if (!valor.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < valor.length() - 1; i++) {
            sum += Character.getNumericValue(valor.charAt(i));
        }

        int verificador = sum % 10;
        int ultimoDigito = Character.getNumericValue(valor.charAt(valor.length() - 1));

        return verificador == ultimoDigito;
                }
        return false;
    }
}