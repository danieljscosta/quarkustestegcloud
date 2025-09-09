package br.com.danieljscosta.controller;

import br.com.danieljscosta.dto.Product;
import br.com.danieljscosta.response.Result;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import jakarta.inject.Inject;
import jakarta.validation.Validator;
import jakarta.ws.rs.Produces;

@Path("/product")
public class ProductController {

/*
    @Inject
    Validator validator;
*/
    @POST
    public Result addProduct(@Valid Product product){
        return new Result("Produto adicionado com sucesso");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return """
                Olá mundo de Quarkus, para acessar via POST: http://localhost:8080/product
                
                Exemplo de JSON:
                {
                    "label": "Notebook",
                    "description": "Notebook Dell",
                    "quantity": 10,
                    "price": 3500.00
                }
               """;
    }

}
