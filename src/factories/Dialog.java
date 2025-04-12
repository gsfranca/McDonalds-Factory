package factories;

import buttons.Button;

/**
 * Essa é a classe base das "fábricas".
 * Ela define o método renderWindow() que todos os tipos de diálogo vão usar.
 * 
 * O método createButton() é abstrato e cada subclasse (HtmlDialog ou WindowsDialog)
 * vai dizer qual botão exatamente vai ser criado.
 */
public abstract class Dialog {
    public void renderWindow() {
        // Cria um botão usando a fábrica atual (que pode ser HTML ou Windows)
        Button okButton = createButton();
        okButton.render(); // Mostra o botão
    }

    // Método abstrato — quem herdar essa classe precisa implementar
    public abstract Button createButton();
}
