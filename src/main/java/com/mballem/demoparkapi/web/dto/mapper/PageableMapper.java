package com.mballem.demoparkapi.web.dto.mapper;

import com.mballem.demoparkapi.web.dto.PageableDTO;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

public class PageableMapper<T> {

    @SuppressWarnings("unchecked")
    public static <T> PageableDTO<T> toDTO(Page<T> page) {
        return new ModelMapper().map(page, PageableDTO.class);
    }
}
