package com.mballem.demoparkapi.web.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClienteCreateDTO {

    @NotBlank
    @Size(min = 5, max = 100)
    private String nome;

    @CPF
    @Size(min = 11, max = 11)
    private String cpf;
}
