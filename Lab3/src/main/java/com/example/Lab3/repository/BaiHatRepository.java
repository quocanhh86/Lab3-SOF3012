package com.example.Lab3.repository;

import com.example.Lab3.model.BaiHat;
import com.example.Lab3.utils.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class BaiHatRepository {
    Session s;
    public BaiHatRepository(){
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<BaiHat> getAll(){
        return s.createQuery("FROM BaiHat").list();
    }

    public void add(BaiHat bh){
        try {
            s.getTransaction().begin();
            s.save(bh);
            s.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }

    public static void main(String[] args) {
        System.out.println(new BaiHatRepository().getAll());
    }
}
