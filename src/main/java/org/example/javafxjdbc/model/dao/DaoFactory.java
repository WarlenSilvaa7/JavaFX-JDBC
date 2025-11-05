package org.example.javafxjdbc.model.dao;


import org.example.javafxjdbc.db.DB;
import org.example.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import org.example.javafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
