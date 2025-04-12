import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> itens = new ArrayList<>();
    private double total = 0;

    public void adicionarItem(String nome, double preco) {
        itens.add(nome + " - R$ " + preco);
        total += preco;
    }

    public void fecharPedido() {
        System.out.println("🧾 Itens do pedido:");
        for (String item : itens) {
            System.out.println(" - " + item);
        }
        System.out.println("💵 Total: R$ " + total + "\n");
    }
}