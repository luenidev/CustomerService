package de.luenidev.shop.CustomerService.domain.impl;

import de.luenidev.shop.CustomerService.domain.CustomerService;
import de.luenidev.shop.CustomerService.model.Customer;
import de.luenidev.shop.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link CustomerService}.
 * @author ctschubel
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository custRepo;

    @Override
    public List<Customer> getAllCustomers() {
        return custRepo.findAll();
    }

    @Override
    public Customer getCustomer(String id) {

        return this.custRepo.findById(id).orElseThrow();
    }

    @Override
    public void addCustomer(Customer customer) {
        this.custRepo.save(customer);

    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.custRepo.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        this.custRepo.deleteById(id);

    }
}
