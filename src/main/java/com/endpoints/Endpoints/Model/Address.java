package com.endpoints.Endpoints.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int id;
    private String city;
    private String state;
    private int zipcode;
    ArrayList<Integer> userIds;
}
