package de.luenidev.shop.CustomerService.repository;

import de.luenidev.shop.CustomerService.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}

