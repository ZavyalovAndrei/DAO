package com.zavialov.DAO.service;

import com.zavialov.DAO.exeption.EmptyRequestExeption;
import com.zavialov.DAO.exeption.NotFindExeption;
import com.zavialov.DAO.repository.RepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDAO {
    @Autowired
   private RepositoryDAO repository;

    public List<String> getOrders(String name) throws Exception {
        if (name.isEmpty()) {
            throw new EmptyRequestExeption("Field \"name\" is empty!");
        }
        List <String> customerOrders = repository.getProductName(name);
        if (customerOrders.isEmpty()) {
            throw new NotFindExeption("Unknown customer " + name + "!");
        }
        return customerOrders;
    }
}