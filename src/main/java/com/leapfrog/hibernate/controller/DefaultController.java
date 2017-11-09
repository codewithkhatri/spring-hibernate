/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernate.controller;

import com.leapfrog.hibernate.dao.CustomerDAO;
import com.leapfrog.hibernate.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Welcome
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private CustomerDAO cd;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("customers", cd.getAll());

//        StringBuilder sb = new StringBuilder();
//        for (Customer c : cd.getAll()) {
//
//            sb.append(c.getFirstName()).append(",");
//
//        }
//        return sb.toString();
        return "index";
    }
}
