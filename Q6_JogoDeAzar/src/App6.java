public class App6 {
    public static void main(String[] args) {
        IDado d6 = new DadoComHistorico(new Dado(6));
        IDado d20 = new DadoComHistorico(new Dado(20));

        for (int i = 0; i < 5; i++) {
            d6.rolar();
            d20.rolar();
        }

        System.out.println("D6 último valor: " + d6.getValor());
        System.out.println("D6 histórico: " + ((DadoComHistorico)d6).getHistorico());
        System.out.println("D20 último valor: " + d20.getValor());
        System.out.println("D20 histórico: " + ((DadoComHistorico)d20).getHistorico());
    }
}
