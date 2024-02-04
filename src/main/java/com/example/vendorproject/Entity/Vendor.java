package com.example.vendorproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {
    private Integer id;
    private String name;
    private String immat;

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", immat='" + immat + '\'' +
                '}';
    }
}
