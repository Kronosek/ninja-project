package com.ninja.repository;

import java.util.List;

import com.ninja.entities.Reimbursement;
import com.ninja.utils.HibernateUtil;

public class ReimbursementDAO implements ReimbursementDAOInterface{

    @Override
    public Reimbursement createReimbursement(Reimbursement newReimbursement) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newReimbursement);
        HibernateUtil.endTransaction();
        return newReimbursement;
    }

    @Override
    public List<Reimbursement> getAllRequests(){
        HibernateUtil.beginTransaction();
        List<Reimbursement> request = HibernateUtil.getSession().createQuery("from Reimbursement", Reimbursement.class).getResultList();
        return request;
        
    }

    // @Override
    // public List<Reimbursement> getAllRequests() {
    //     
    //     return null;
    // }

    // @Override
    // public Reimbursement updateReimbursement() {
    //     
    //     return null;
    // }

    // @Override
    // public boolean bool() {
    //    
    //     return false;
    // }
    
}
