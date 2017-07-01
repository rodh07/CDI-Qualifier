package br.univel.Animais;

import javax.inject.Inject;
import javax.inject.Named;

import br.univel.Animais.AnimalDao;
import br.univel.Qualifier.AnimaisDomesticos;
import br.univel.Qualifier.AnimaisSelvagens;


@Named("animais")
public class AnimaisExistentes {


    @Inject
    @AnimaisSelvagens
    private AnimalDao animaisSelvagensExistentes;

    @Inject
    @AnimaisDomesticos
    private AnimalDao animaisDomesticosExistentes;

    public String getAnimaisSelvagens() {
        return animaisSelvagensExistentes.existentes();
    }

    public String getAnimaisDomesticos() {
        return animaisDomesticosExistentes.existentes();
    }
}
