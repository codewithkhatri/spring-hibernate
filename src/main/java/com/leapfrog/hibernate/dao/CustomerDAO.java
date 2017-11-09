/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernate.dao;

import com.leapfrog.hibernate.entity.Customer;
import java.util.List;

/**
 *
 * @author Welcome
 */
public interface CustomerDAO {
    List<Customer> getAll();
    void insert(Customer c);
}
