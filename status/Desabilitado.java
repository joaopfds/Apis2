package status;

import menu.Elemento;

public class Desabilitado implements Estado {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void escreveElemento(Elemento el, String espacamento){

        System.out.println(ANSI_RED
                + espacamento
                + el.getNome()
                + ANSI_RESET);

    }
}