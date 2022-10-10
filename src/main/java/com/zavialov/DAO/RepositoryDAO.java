package com.zavialov.DAO;

import com.zavialov.DAO.models.Orders;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class RepositoryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Orders> getProductName(String customerName) {
        Query query = entityManager.createQuery("select o from Orders o where o.customer.name =: name");
        query.setParameter("name", customerName);
        System.out.println(query.getResultList());
        return query.getResultList();
    }
}