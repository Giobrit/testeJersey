package com.example.testeSemInterface.service;

import com.example.testeSemInterface.operacao.Soma;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("semInterface")
public class servico {

    @Inject
    private Soma soma;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Long> comInterface() {
        ArrayList<Long> li = new ArrayList<>();

        li.add(soma.somar(18765760L, 934823346L));

        return li;
    }
}
