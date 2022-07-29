package com.n47.multitenancydemo.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public UserDomain() {
    }

    public UserDomain(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
