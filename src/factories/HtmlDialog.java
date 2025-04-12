package factories;

import buttons.Button;
import buttons.HtmlButton;

/**
 * Fábrica concreta que cria botões HTML.
 */
public class HtmlDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton(); // Cria e retorna um botão do tipo HTML
    }
}
