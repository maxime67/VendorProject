package com.example.vendorproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String ref;
    private String description;
    private Price price;
    private Vendor vendor;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vendor=" + vendor +
                '}';
    }
}
