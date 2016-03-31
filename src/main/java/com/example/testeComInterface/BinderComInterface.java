package com.example.testeComInterface;

import com.example.testeComInterface.operacao.Soma;
import com.example.testeComInterface.operacao.SomaImpl;
import com.google.inject.Binder;
import com.google.inject.Module;

public class BinderComInterface implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(Soma.class).to(SomaImpl.class);
    }
}
