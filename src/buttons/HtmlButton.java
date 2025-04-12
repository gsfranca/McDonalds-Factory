package buttons;

/**
 * Esse é um botão estilo HTML (tipo os que usamos em páginas web).
 */
public class HtmlButton implements Button {

    public void render() {
        // Aqui ele imprime um botão como se fosse HTML
        System.out.println("<button>HTML Button</button>");
        onClick(); // Simula o clique logo depois de mostrar o botão
    }

    public void onClick() {
        // Resposta do botão quando clicado
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
