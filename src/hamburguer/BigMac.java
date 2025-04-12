package hamburguer;

public class BigMac implements Hamburguer 
{
    public String getNome() {
        return "Big Mac";
    }

    public double getPreco() {
        return 20.0;
    }

    public void preparar() {
        System.out.println("Preparando Big Mac...");
    }
}
