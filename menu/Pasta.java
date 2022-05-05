package menu;

import status.Estado;

import java.util.ArrayList;

public class Pasta extends Elemento {

  public Pasta(String nome, Estado status) {
       super(nome, status);
    }

    public Pasta(String nome, Estado status, ArrayList<Elemento> elementos) {
        super(nome, status, elementos);
    }
}
