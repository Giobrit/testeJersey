package com.example;

import com.example.testeComInterface.BinderComInterface;
import com.example.testeComInterface.operacao.Soma;
import com.example.testeComInterface.operacao.SomaImpl;
import com.example.testeSemInterface.BinderSemInterface;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class App extends ResourceConfig {
    public App() {
        packages("com.example");

        register(new BinderComInterface());
        register(new BinderSemInterface());
    }
}
