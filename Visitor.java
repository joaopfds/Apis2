import menu.Elemento;

public class Visitor {

    public void percorreArvore(Elemento ele, String espaco){

        ele.getStatus().escreveElemento(ele, espaco);

        espaco = espaco + "  ";

        for (Elemento el: ele.getElementos()) {

            percorreArvore(el, espaco);

        }
    }

}