import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo (>0) para adicionar");
            System.out.println("Digite -1 para ligar visualizador de somatório");
            System.out.println("Digite -2 para ligar visualizador de média");
            System.out.println("Digite 0 para sair");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }else if(valor == -1){
                dados.addObserver(cs);
                System.out.println("Visualizador de Somatório ligado!");
            }else if(valor == -2){
                dados.addObserver(cm);
                System.out.println("Visualizador de Média ligado!");
            }else if(valor > 0){
                dados.add(valor);
            }else{
                System.out.println("Valor inválido");
            }
        }
        System.out.println("Fim");
    }
}

