package br.com.danieljscosta.response;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;

public class Result {

    @JsonProperty("messageX")
    private String messageX;

    @JsonProperty("sucess")
    private boolean sucess;

    public String pegaMessageX(){
        return messageX;
    }

    public boolean verdadeSucess(){
        return sucess;
    }

    public Result(String message){
        this.messageX = message;
        this.sucess = true;
    }
    /*
    public Result(Set<? extends ConstraintViolation<?>> violations){
        this.sucess = false;
        this.messageX = violations.stream()
                .map(cv -> cv.getMessage())
                .collect(Collectors.joining(", "));
    }
    */

}
