package com.example.testeSemInterface.operacao;

import java.time.LocalDateTime;

public class Soma {

    public ResponseSoma somar(Long numero1, Long numero2) {
        return new ResponseSoma(LocalDateTime.now(), numero1 + numero2);
    }
}

