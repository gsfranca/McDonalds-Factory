package factories;

import buttons.Button;
import buttons.WindowsButton;

/**
 * Fábrica concreta que cria botões estilo Windows.
 */
public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton(); // Cria e retorna um botão estilo Windows
    }
}
