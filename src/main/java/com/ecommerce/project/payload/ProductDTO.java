package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productId;
    private String productName;
    private String image;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;
}
