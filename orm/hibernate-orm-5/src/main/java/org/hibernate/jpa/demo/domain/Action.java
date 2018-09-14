package org.hibernate.jpa.demo.domain;

import javax.persistence.*;

/**
 * Created by kirill.marchuk on 14.09.2018
 */
@Entity
@Table(name = "UC_ACTIONS")
public class Action {
    private Long id;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return this.id;
    }

    public Action(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
