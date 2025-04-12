package hamburguer;

public class McChicken implements Hamburguer 
{
    public String getNome() {
        return "McChicken";
    }

    public double getPreco() {
        return 18.0;
    }

    public void preparar() {
        System.out.println("Preparando McChicken...");
    }
}