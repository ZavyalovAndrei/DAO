package com.zavialov.DAO;

import com.zavialov.DAO.exeption.EmptyRequestExeption;
import com.zavialov.DAO.exeption.NotFindExeption;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/")
@RestController
public class ControllerDAO {


    private RepositoryDAO repository;

    public ControllerDAO(RepositoryDAO repository) {
        this.repository = repository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(name = "name") String customerName) {
        if (customerName.isEmpty()) {
            throw new EmptyRequestExeption("Field \"name\" is empty!");
        }
        List<String> customerOrders = repository.getProductName(customerName);
        if (customerOrders.isEmpty()) {
            throw new NotFindExeption("Unknown customer " + customerName + "!");
        }
        return customerOrders;
    }

    @ExceptionHandler(EmptyRequestExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveEmptyRequestException(EmptyRequestExeption exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(NotFindExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveNotFindException(NotFindExeption exception) {
        return exception.getMessage();
    }
}