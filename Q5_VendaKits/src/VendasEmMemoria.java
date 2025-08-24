import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<ProdutoComponent> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		Produto caneta = new Produto(1, "Caneta", 1.55);
        Produto borracha = new Produto(2, "Borracha", 1.15);
        Produto caderno = new Produto(3, "Caderno", 32.99);
		produtos.add(caneta);
		produtos.add(borracha);
		produtos.add(caderno);

		// Kit: Caneta + Borracha
        List<ProdutoComponent> componentesKit = new ArrayList<>();
        componentesKit.add(caneta);
        componentesKit.add(borracha);
        produtos.add(new KitProdutos(4, "Kit Escolar", componentesKit));
	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		ProdutoComponent prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<ProdutoComponent> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}
