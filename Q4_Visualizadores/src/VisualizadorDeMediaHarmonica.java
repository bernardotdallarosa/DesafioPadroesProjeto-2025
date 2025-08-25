import java.util.LinkedList;
import java.util.List;

public class VisualizadorDeMediaHarmonica implements Observer {
    private List<Integer> valores;

    public VisualizadorDeMediaHarmonica() {
        this.valores = new LinkedList<>();
    }

    public void defineValores(List<Integer> valores) {
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor) {
        this.valores.add(valor);
    }

    public void exibeMedia() {
        double somaInversos = valores.stream()
                .mapToDouble(v -> 1.0 / v)
                .sum();

        double mediaHarmonica = valores.size() / somaInversos;

        System.out.println("Média Harmônica: " + mediaHarmonica +
                ", quantidade de elementos analisados: " + valores.size());
    }

    public void update(Integer value) {
        valores.add(value);
        exibeMedia();
    }
}