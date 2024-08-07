package com.jhkwak.productservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartRequestDto {
    private String type;
    private List<Long> productId;
    private List<Integer> quantity;
}
