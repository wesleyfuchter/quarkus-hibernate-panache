package com.wesleyfuchter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.reactivex.annotations.NonNull;

@Entity
@Table(name = "\"User\"")
public class User extends PanacheEntity {

    @NonNull
    @Column
    public String name;

}