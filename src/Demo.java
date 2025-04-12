import factories.Dialog;
import factories.HtmlDialog;
import factories.WindowsDialog;

/**
 * Classe principal onde tudo acontece!
 * Aqui é o ponto de entrada do programa.
 */
public class Demo {
    private static Dialog dialog; // Essa variável vai guardar o tipo de "janela" (fábrica) que será usada

    public static void main(String[] args) {
        configure();         // Configura qual tipo de diálogo vai ser criado (Windows ou HTML)
        runBusinessLogic();  // Executa o botão com base na fábrica escolhida
    }

    /**
     * Esse método decide qual fábrica será usada.
     * Se o sistema operacional for Windows 10, ele cria um WindowsDialog,
     * senão, ele usa um HtmlDialog.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Esse método mostra como o código pode usar a fábrica sem se preocupar
     * com qual botão (Windows ou HTML) está sendo usado.
     * Ele só chama renderWindow() e o resto acontece por trás dos panos.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
