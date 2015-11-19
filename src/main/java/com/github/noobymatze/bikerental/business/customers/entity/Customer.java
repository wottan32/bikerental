package com.github.noobymatze.bikerental.business.customers.entity;

import com.github.noobymatze.bikerental.business.Person;
import com.github.noobymatze.bikerental.business.administration.entity.User;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Represents a customer of the bike rental.
 *
 * @author Matthias Metzger
 */
@Entity
@Table(name = "customer")
public class Customer extends Person {

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public User getUser() {
        return user;
    }

}
