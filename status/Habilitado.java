package status;

import menu.Elemento;

public class Habilitado implements Estado {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void escreveElemento(Elemento el, String espacamento){

        System.out.println(ANSI_BLUE
                + espacamento
                + "-"
                + el.getNome()
                + ANSI_RESET);

    }
}