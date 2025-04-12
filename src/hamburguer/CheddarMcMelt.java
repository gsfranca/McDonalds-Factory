package hamburguer;

public class CheddarMcMelt implements Hamburguer 

{
    public String getNome() {
        return "Cheddar McMelt";
    }

    public double getPreco() {
        return 22.0;
    }

    public void preparar() {
        System.out.println("Preparando Cheddar McMelt...");
    }
}