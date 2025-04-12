package factories;

import hamburguer.CheddarMcMelt;
import hamburguer.Hamburguer;

public class CheddarMcMeltCreator  extends HamburguerCreator {
       public Hamburguer criarHamburguer() {
        return new CheddarMcMelt();
    } 
}
