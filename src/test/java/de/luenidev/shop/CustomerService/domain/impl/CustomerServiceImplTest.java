package de.luenidev.shop.CustomerService.domain.impl;

import de.luenidev.shop.CustomerService.domain.CustomerService;
import de.luenidev.shop.CustomerService.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * unit tests for {@link CustomerService}
 * @author ctschubel
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService service;

    @Before
    public void setUp(){
        this.removeTestData();
    }

    @Test
    public void addCustomerTest() throws Exception {
        Customer customer = new Customer().setEmail("test@gmail.com").setName("test").setId("1");
        this.service.addCustomer(customer);
        List<Customer> actual = this.service.getAllCustomers();
        assertThat(actual).hasSize(1);
        assertThat(actual.get(0).getEmail()).isEqualTo(customer.getEmail());
        assertThat(actual.get(0).getName()).isEqualTo(customer.getName());

    }

    private void removeTestData(){
        this.service.getAllCustomers().stream().forEach(customer -> service.deleteCustomer(customer.getId()));
    }
}