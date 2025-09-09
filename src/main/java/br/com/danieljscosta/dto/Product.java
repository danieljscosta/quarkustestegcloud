package br.com.danieljscosta.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {

    public Long id;

    @NotBlank(message = "O rotulo não pode esta vazio")
    public String label;

    @NotBlank(message = "A descrição não pode esta vazia")
    public String description;

    @Min(message = "Quantidade não pode ser zero", value = 1)
    public Integer quantity;

    @Min(message = "O valor não pode ser zero",value = 1)
    public Double price;
}
