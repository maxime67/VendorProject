package com.example.vendorproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private Integer id;
    private Long ttcPrice;
    private Long htPrice;
    private Long tvaRate;

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", ttcPrice=" + ttcPrice +
                ", htPrice=" + htPrice +
                ", tvaRate=" + tvaRate +
                '}';
    }
}
