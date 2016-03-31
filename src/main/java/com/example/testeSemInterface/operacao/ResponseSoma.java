package com.example.testeSemInterface.operacao;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ResponseSoma implements Serializable {
    LocalDateTime data;
    Long resultado;

    public ResponseSoma(LocalDateTime data, Long resultado) {
        this.data = data;
        this.resultado = resultado;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Long getResultado() {
        return resultado;
    }

    public void setResultado(Long resultado) {
        this.resultado = resultado;
    }
}
