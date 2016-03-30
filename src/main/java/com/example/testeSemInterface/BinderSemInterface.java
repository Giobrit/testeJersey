package com.example.testeSemInterface;

import com.example.testeSemInterface.operacao.Soma;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class BinderSemInterface extends AbstractBinder {
    @Override
    protected void configure() {
        bind(Soma.class).to(Soma.class);
    }
}
