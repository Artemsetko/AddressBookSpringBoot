package com.github.artemsetko.javafx.service;

import com.github.artemsetko.javafx.entity.Person;
import javafx.collections.ObservableList;
import org.springframework.data.domain.Page;


public interface AddressBook {

    void add(Person person);

    void update(Person person);

    void delete(Person person);

    ObservableList<Person> findAll();

    ObservableList<Person> find(String text);

    Page findAll(int from, int count);

    Page findAll(int from, int count, String... text);


}
