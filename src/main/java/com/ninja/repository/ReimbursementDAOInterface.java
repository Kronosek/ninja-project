package com.ninja.repository;

import java.util.List;

import com.ninja.entities.Reimbursement;

public interface ReimbursementDAOInterface {
    /*
     * this interface is where i will decleare the methods
     * that i need to test. all methods i create here will
     * by default be considered public and abstract
     * 
     * PUBLIC: can be accessed anywhere
     * ABSTRACT: the implemntation for method must be handled elsewhere
     */

     //creates
    Reimbursement createReimbursement(Reimbursement newReimbursement);

     //reads
    List <Reimbursement> getAllRequests();

    //  //updates
    // Reimbursement updateReimbursement();

    //  //deletes
    // boolean bool();
}
