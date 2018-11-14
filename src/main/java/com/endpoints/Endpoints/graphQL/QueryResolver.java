package com.endpoints.Endpoints.graphQL;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.endpoints.Endpoints.DataProvider;
import com.endpoints.Endpoints.model.Address;
import com.endpoints.Endpoints.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    DataProvider dataProvider;

    public String getSample() {

        return "this is sample method";
    }

    public List<User> getUsers() {

        return dataProvider.getUsers();
    }

    public List<Address> getAddresses() {

        return dataProvider.getAddresses();
    }

    public List<Address> getAddressIds() {

        return dataProvider.getAddresses();
    }

    public User getUserbyId(int user) {

        return dataProvider.getUsers().get(user);
    }

    public Address getAddressbyId(int address) {

        return dataProvider.getAddresses().get(address);
    }

}