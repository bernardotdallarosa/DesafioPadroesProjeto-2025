public class App3 {
    public static void main(String[] args) throws Exception {
        Codificador cod = new Codificador();
        String aux = "Desafio Padrões de Projeto";

        cod.setStrategy(new DeCodificaSimples());
        String codificado = cod.executeStrategyCodifica(aux);
        System.out.println("Codificado Simples: " + codificado);

        String decodificado = cod.executeStrategyDecodifica(codificado);
        System.out.println("Decodificado Simples: " + decodificado);

        cod.setStrategy(new DeCodificaDesloca());
        codificado = cod.executeStrategyCodifica(aux);
        System.out.println("Codificado Desloca: " + codificado);

        decodificado = cod.executeStrategyDecodifica(codificado);
        System.out.println("Decodificado Desloca: " + decodificado);
     }
}