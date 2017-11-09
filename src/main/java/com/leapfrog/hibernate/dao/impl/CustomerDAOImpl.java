/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernate.dao.impl;

import com.leapfrog.hibernate.dao.CustomerDAO;
import com.leapfrog.hibernate.entity.Customer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Welcome
 */
@Repository(value = "CustomerDAO")
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public List<Customer> getAll() {
        session = sessionFactory.openSession();
        List<Customer> customerList = session.createQuery("from Customer").list();
        session.close();
        return customerList;
    }

    @Override
    public void insert(Customer c) {
        session = sessionFactory.getCurrentSession();
        trans = session.beginTransaction();
        session.save(c);
        trans.commit();
    }

}
