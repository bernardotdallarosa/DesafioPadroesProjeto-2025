import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();
        var cmh = new VisualizadorDeMediaHarmonica();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nEntre um valor positivo (>0) para adicionar");
            System.out.println("Digite -1 para ligar visualizador de somatório");
            System.out.println("Digite -2 para ligar visualizador de média");
            System.out.println("Digite -3 para ligar visualizador de média harmônica");
            System.out.println("Digite 0 para sair");

            int valor;
            try {
                valor = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                continue;
            }

            switch (valor) {
                case 0:
                    System.out.println("Fim");
                    s.close();
                    return; // encerra o programa

                case -1:
                    dados.addObserver(cs);
                    System.out.println("Visualizador de Somatório ligado!");
                    break;

                case -2:
                    dados.addObserver(cm);
                    System.out.println("Visualizador de Média ligado!");
                    break;

                case -3:
                    dados.addObserver(cmh);
                    System.out.println("Visualizador de Média Harmônica ligado!");
                    break;

                default:
                    if (valor > 0) {
                        dados.add(valor);
                    } else {
                        System.out.println("Valor inválido! Digite conforme o menu.");
                    }
                    break;
            }
        }
    }
}
