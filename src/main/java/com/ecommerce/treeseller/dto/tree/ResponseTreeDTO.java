package com.ecommerce.treeseller.dto.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTreeDTO {
    private String id;
    private String name;
    private Integer age;
    private Boolean isActive;
}
