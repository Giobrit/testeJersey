package com.example.testeSemInterface.operacao;

import org.apache.http.HttpEntity;

import javax.inject.Singleton;
import java.time.LocalDateTime;

@Singleton
public class Soma {

    private LocalDateTime localDateTime = LocalDateTime.now();

    public ResponseSoma somar(Long numero1, Long numero2) {
        return new ResponseSoma(localDateTime, numero1 + numero2);
    }
}

