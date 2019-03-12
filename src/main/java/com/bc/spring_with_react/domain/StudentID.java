package com.bc.spring_with_react.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class StudentID {

    @Id
    @Column(name="id")
    private Integer id;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

}
