import factories.CheddarMcMeltCreator;
import factories.HamburguerCreator;
import hamburguer.Hamburguer;

public class Venda {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Criando o hambúrguer com Factory Method
        HamburguerCreator creator = new CheddarMcMeltCreator();
        Hamburguer hamburguer = creator.criarHamburguer();
        hamburguer.preparar();
        pedido.adicionarItem(hamburguer.getNome(), hamburguer.getPreco());

        // Adicionando batata e bebida manualmente
        pedido.adicionarItem("Batata Média", 10.0);
        pedido.adicionarItem("Coca-Cola 500ml", 8.0);

        // Finalizando pedido
        pedido.fecharPedido();
    }
}
