import java.util.List;

public class KitProdutos implements ProdutoComponent {
    private int id;
    private String nome;
    private List<ProdutoComponent> componentes;

    public KitProdutos(int id, String nome, List<ProdutoComponent> componentes) {
        this.id = id;
        this.nome = nome;
        this.componentes = componentes;
    }

    @Override
    public int getId() { return id; }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getPreco() {
        double total = 0.0;
        for (ProdutoComponent comp : componentes) {
            total += comp.getPreco();
        }
        return total * 0.9; // 10% de desconto
    }

    public List<ProdutoComponent> getComponentes() {
        return componentes;
    }
    
}
