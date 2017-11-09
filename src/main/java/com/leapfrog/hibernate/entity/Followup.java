/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Welcome
 */
@Entity
@Table(name = "tbl_followups")
@NamedQueries({
    @NamedQuery(name = "Followup.findAll", query = "SELECT f FROM Followup f")})
public class Followup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "message", insertable = false)
    private String message;
    @Column(name = "followup_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date followupDate;
    @Column(name = "next_followup_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextFollowupDate;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customer customer;

    public Followup() {
    }

    public Followup(Integer id) {
        this.id = id;
    }

    public Followup(Integer id, String message, Date followupDate) {
        this.id = id;
        this.message = message;
        this.followupDate = followupDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public Date getNextFollowupDate() {
        return nextFollowupDate;
    }

    public void setNextFollowupDate(Date nextFollowupDate) {
        this.nextFollowupDate = nextFollowupDate;
    }

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer= customer;
    }

   
}
