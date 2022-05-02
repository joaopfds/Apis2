import menu.Arquivo;
import menu.Elemento;
import menu.Pasta;
import status.Desabilitado;
import status.Habilitado;

import java.util.ArrayList;

public class Main {

    private static void montaArvore(){

        //Estado habilitado = new Habilitado();
        //Estado desabilitado = new Desabilitado();

        ArrayList<Elemento> vazio = new ArrayList<>();

        Elemento funcN = new Arquivo("Funcionaliade N", new Habilitado());
        Elemento funcO = new Arquivo("Funcionaliade O", new Habilitado());
        Elemento funcP = new Arquivo("Funcionaliade P", new Desabilitado());
        ArrayList<Elemento> filhosMenu512 = new ArrayList<>();
        filhosMenu512.add(funcN);
        filhosMenu512.add(funcO);
        filhosMenu512.add(funcP);

        Elemento menu512 = new Pasta("Menu 5.1.2", new Habilitado(), filhosMenu512);
        menu512.setElementos(filhosMenu512);
        Elemento menu511= new Pasta("Menu 5.1.1", new Desabilitado(), vazio);

        ArrayList<Elemento> filhosMenu51 = new ArrayList<>();
        filhosMenu51.add(menu511);
        filhosMenu51.add(menu512);

        Elemento menu51 = new Pasta("Menu 5.1", new Habilitado(), filhosMenu51);
        menu51.setElementos(filhosMenu51);

        ArrayList<Elemento> filhosMenu5 = new ArrayList<>();
        filhosMenu5.add(menu51);

        Elemento menu5 = new Pasta("Menu 5", new Habilitado(), filhosMenu5);
        menu5.setElementos(filhosMenu5);

        // monta menu 4

        Elemento funcL = new Arquivo("Funcionaliade L", new Habilitado());
        Elemento funcM = new Arquivo("Funcionaliade M", new Habilitado());
        ArrayList<Elemento> filhosMenu41 = new ArrayList<>();
        filhosMenu41.add(funcL);
        filhosMenu41.add(funcM);

        Elemento menu41 = new Pasta("Menu 4.1", new Habilitado(), filhosMenu41);
        menu41.setElementos(filhosMenu41);
        Elemento funcK = new Arquivo("Funcionaliade K", new Habilitado());

        ArrayList<Elemento> filhosMenu4 = new ArrayList<>();
        filhosMenu4.add(menu41);
        filhosMenu4.add(funcK);

        Elemento menu4 = new Pasta("Menu 4", new Habilitado(), filhosMenu4);
        menu4.setElementos(filhosMenu4);

        // MONTA MENU 3

        Elemento menu3 = new Pasta("Menu 3", new Desabilitado(), vazio);

        // MONTA MENU 2

        Elemento funcG = new Arquivo("Funcionaliade G", new Habilitado());
        Elemento funcH = new Arquivo("Funcionaliade H", new Desabilitado());
        Elemento funcI = new Arquivo("Funcionaliade I", new Habilitado());

        ArrayList<Elemento> filhosMenu212 = new ArrayList<>();
        filhosMenu212.add(funcG);
        filhosMenu212.add(funcH);
        filhosMenu212.add(funcI);

        Elemento menu212 = new Pasta("Menu 2.1.2", new Habilitado(), filhosMenu212);
        menu212.setElementos(filhosMenu212);

        Elemento funcE = new Arquivo("Funcionaliade E", new Desabilitado());
        Elemento funcF = new Arquivo("Funcionaliade F", new Habilitado());

        ArrayList<Elemento> filhosMenu211 = new ArrayList<>();
        filhosMenu211.add(funcE);
        filhosMenu211.add(funcF);

        Elemento menu211= new Pasta("Menu 2.1.1", new Habilitado(), filhosMenu211);

        ArrayList<Elemento> filhosMenu21 = new ArrayList<>();
        filhosMenu21.add(menu211);
        filhosMenu21.add(menu212);

        Elemento menu21= new Pasta("Menu 2.1", new Habilitado(), filhosMenu21);

        ArrayList<Elemento> filhosMenu2 = new ArrayList<>();
        filhosMenu2.add(menu21);

        Elemento menu2= new Pasta("Menu 2.1", new Habilitado(), filhosMenu2);

        // MONTA MENU 1

        Elemento funcC = new Arquivo("Funcionaliade C", new Habilitado());
        Elemento funcD = new Arquivo("Funcionaliade D", new Habilitado());

        ArrayList<Elemento> filhosMenu11 = new ArrayList<>();
        filhosMenu11.add(funcC);
        filhosMenu11.add(funcD);

        Elemento menu11= new Pasta("Menu 1.1", new Habilitado(), filhosMenu11);

        Elemento funcB = new Arquivo("Funcionaliade B", new Habilitado());

        ArrayList<Elemento> filhosMenu1 = new ArrayList<>();
        filhosMenu1.add(funcB);
        filhosMenu1.add(menu11);

        Elemento menu1= new Pasta("Menu 1", new Habilitado(), filhosMenu1);

        //MONTA MENU

        Elemento funcA = new Arquivo("Funcionaliade A", new Habilitado());

        ArrayList<Elemento> filhosMenu = new ArrayList<>();
        filhosMenu.add(funcA);
        filhosMenu.add(menu1);
        filhosMenu.add(menu2);
        filhosMenu.add(menu3);
        filhosMenu.add(menu4);
        filhosMenu.add(menu5);

        Elemento menu= new Pasta("Menu", new Habilitado(), filhosMenu);


        Visitor visitor = new Visitor();

        visitor.percorreArvore(menu, "");
    }

    public static void main(String[] args)
    {
        montaArvore();
    }


}
