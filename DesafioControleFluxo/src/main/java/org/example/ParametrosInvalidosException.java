package org.example;

public class ParametrosInvalidosException extends  Throwable {

    private String messageError = "O segundo parâmetro deve ser maior que o primeiro.";

    public ParametrosInvalidosException() {
        this.messageError = messageError;
    }

    public String getMessage() {
        return messageError;
    }

}
