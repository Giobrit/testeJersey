package com.example;

import com.example.testeComInterface.BinderComInterface;
import com.example.testeSemInterface.BinderSemInterface;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class App extends ResourceConfig {
    @Inject // Note: inject from HK2
    public void ApplicationConfig(ServiceLocator serviceLocator) {

        //final Logger logger = LoggerFactory.getLogger(getClass());

        // Guice
        Injector injector = Guice.createInjector(new BinderSemInterface(), new BinderComInterface());

        // Guice HK2 bridge
        // See e.g. https://github.com/t-tang/jetty-jersey-HK2-Guice-boilerplate
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge bridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        bridge.bridgeGuiceInjector(injector);

        // Application startup and shutdown listener
//        register(ApplicationLifecycleListener.class);
//        register(MultiPartFeature.class);

        // Scans during deployment for JAX-RS components in packages
        packages("com.example");

    }
}