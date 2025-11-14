package org.example.javafxjdbc.model.services;

import org.example.javafxjdbc.model.dao.DaoFactory;
import org.example.javafxjdbc.model.dao.SellerDao;
import org.example.javafxjdbc.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll(){
        return dao.findaAll();
    }

    public void saveOrUpdate(Seller obj){
        if (obj.getId() == null){
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj){
        dao.deleteById(obj.getId());
    }
}
