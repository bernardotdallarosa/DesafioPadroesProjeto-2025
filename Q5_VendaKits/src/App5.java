import java.util.List;

public class App5 {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<ProdutoComponent> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, produtos.get(0).getId(), 1); // Caneta
        proc.registrarVenda(venda, produtos.get(1).getId(), 2); // Borracha
        proc.registrarVenda(venda, produtos.get(3).getId(), 1); // Kit Escolar
        System.out.println(proc.emitirComprovante(venda));
    }
}
