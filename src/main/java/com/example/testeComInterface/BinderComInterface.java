package com.example.testeComInterface;

import com.example.testeComInterface.operacao.Soma;
import com.example.testeComInterface.operacao.SomaImpl;
import com.google.inject.AbstractModule;

public class BinderComInterface extends AbstractModule {
    @Override
    protected void configure() {
        bind(Soma.class).to(SomaImpl.class);
    }
}
