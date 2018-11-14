package com.endpoints.Endpoints;

import com.endpoints.Endpoints.model.Address;
import com.endpoints.Endpoints.model.User;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
public class DataProvider implements CommandLineRunner {


    public ArrayList<User> users=new ArrayList<>();
    public ArrayList<Address> addresses=new ArrayList<>();
    private ArrayList<Integer> userIds1 = new ArrayList<>();
    private ArrayList<Integer> userIds2 = new ArrayList<>();
    private ArrayList<Integer> userIds3 = new ArrayList<>();

    @Override
    public void run(String... strings) {

        System.out.println("initializing data");

        users.add(new User(1,"Gowtham",1));
        users.add(new User(2,"Chinna",2));
        users.add(new User(3,"Honey",2));
        users.add(new User(4,"Akshara",3));
        users.add(new User(5,"Apoorv",5));

        userIds1.add(1);
        addresses.add(new Address(1,"Minnetonka","MN",55305, userIds1));
        userIds2.add(2);
        addresses.add(new Address(1,"Hopkins","MN",553434,userIds2));
        userIds2.add(3);
        addresses.add(new Address(3,"Minneapolis","MN",55402,userIds2));
        userIds3.add(4);
        addresses.add(new Address(4,"DelrayBeach","MN",33446,userIds3));
        userIds3.add(5);
        addresses.add(new Address(5,"Boca","MN",33487,userIds3));
    }
}
