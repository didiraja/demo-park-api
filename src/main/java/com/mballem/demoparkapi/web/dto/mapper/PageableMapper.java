package com.mballem.demoparkapi.web.dto.mapper;

import com.mballem.demoparkapi.web.dto.PageableDTO;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

public class PageableMapper {

    public static PageableDTO toDTO(Page page) {
        return new ModelMapper().map(page, PageableDTO.class);
    }
}
