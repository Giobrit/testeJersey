package com.example.testeComInterface;

import com.example.testeComInterface.operacao.Soma;
import com.example.testeComInterface.operacao.SomaImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class BinderComInterface extends AbstractBinder {
    @Override
    protected void configure() {
        bind(SomaImpl.class).to(Soma.class);
    }
}