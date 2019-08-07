package de.luenidev.shop.CustomerService.repository;

import de.luenidev.shop.CustomerService.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    @Override
    public List<Customer> findAll();
}

