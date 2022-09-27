package com.zavialov.DAO.controller;

import com.zavialov.DAO.exeption.EmptyRequestExeption;
import com.zavialov.DAO.exeption.NotFindExeption;
import com.zavialov.DAO.service.ServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ControllerDAO {
    @Autowired
    ServiceDAO service;

    @GetMapping("/fetch-product")
    public List<String> getProductName(@RequestParam(name = "name") String customerName) throws Exception {
        return service.getOrders(customerName);
    }

    @ExceptionHandler(EmptyRequestExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveEmptyRequestExeption (EmptyRequestExeption exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(NotFindExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveNotFindExeptionn (NotFindExeption exception) {
        return exception.getMessage();
    }
}
