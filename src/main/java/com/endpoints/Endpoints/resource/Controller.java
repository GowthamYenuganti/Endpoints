package com.endpoints.Endpoints.resource;

import com.endpoints.Endpoints.DataProvider;
import com.endpoints.Endpoints.Model.Address;
import com.endpoints.Endpoints.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @Autowired
    DataProvider dataProvider;

    @RequestMapping(value="getUsers",
            method= RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public ResponseEntity<Object> getData() {
        return new ResponseEntity(dataProvider.getUsers(), HttpStatus.OK);
    }

    @RequestMapping(value="getAddress",
            method= RequestMethod.GET,
            produces = "application/json")

    @ResponseBody
    public ResponseEntity<Object> getAddress() {
        return new ResponseEntity(dataProvider.getAddresses(),HttpStatus.OK);
    }

}
