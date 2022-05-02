package status;

import menu.Elemento;

public interface Estado {

    default void escreveElemento(Elemento el, String espacamento){};

}
