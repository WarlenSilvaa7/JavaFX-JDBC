package org.example.javafxjdbc.model.dao;

import org.example.javafxjdbc.model.entities.Department;
import org.example.javafxjdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findaAll();
    List<Seller> findByDepartment(Department department);

}
