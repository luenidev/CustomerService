package de.luenidev.shop.CustomerService.domain;


import de.luenidev.shop.CustomerService.model.Customer;

/**
 * CustomerService interface.
 *
 * @author ctschubel
 */
public interface CustomerService {

    /**
     * Get a customer by ID-
     * @param id
     * @return Customer
     */
    public Customer getCustomer(String id);

    /**
     * Add a customer.
     * @param customer
     */
    public void addCustomer(Customer customer);

    /**
     * Update a customer.
     * @param customer
     * @return
     */
    public Customer updateCustomer(Customer customer);

    /**
     * Remove a customer.
     * @param id
     */
    public void deleteCustomer(String id);
}
