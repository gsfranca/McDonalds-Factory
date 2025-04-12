package factories;

import hamburguer.BigMac;
import hamburguer.Hamburguer;

public class BigMacCreator extends HamburguerCreator{
        public Hamburguer criarHamburguer() {
        return new BigMac();
    }
}
