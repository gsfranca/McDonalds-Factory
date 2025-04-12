package buttons;

/**
 * Esse botão é estilo Windows (como se fosse de um programa no Windows).
 */
public class WindowsButton implements Button {

    public void render() {
        // Mostra o botão no estilo Windows
        System.out.println("Rendering a Windows button.");
        onClick(); // Simula o clique logo em seguida
    }

    public void onClick() {
        // Resposta do botão quando clicado
        System.out.println("Click! WindowsButton says - 'Hello World!'");
    }
}
