package com.mballem.demoparkapi.web.dto;

import com.mballem.demoparkapi.repository.projection.ClienteVagaProjection;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Array;

import java.util.List;

public class PageableClienteVagaDTO extends PageableDTO<ClienteVagaProjection> {
    @ArraySchema(schema = @Schema(implementation = ClienteVagaProjection.class))
    @Override
    public List<?> getContent() {
        return super.getContent();
    }
}
