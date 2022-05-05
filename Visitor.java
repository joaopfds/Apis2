import menu.Elemento;

public class Visitor {

    public void percorreArvore(Elemento menuEle, String espaco){

        menuEle.getStatus().escreveElemento(menuEle, espaco);

        espaco = espaco + "  ";

      try{
        
        for (Elemento el: menuEle.getElementos()) {
  
              percorreArvore(el, espaco);
  
          }        
      }
      catch (Exception e) {
        
      }

    }

}