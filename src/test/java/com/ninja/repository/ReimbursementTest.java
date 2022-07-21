package com.ninja.repository;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ninja.entities.Reimbursement;

public class ReimbursementTest {
    public static ReimbursementDAO reimbursementDAO;

    @BeforeClass
    public static void setup(){
        reimbursementDAO = new ReimbursementDAO();
    }

    @Test
    public void createReimbursementPositiveTest(){
        Reimbursement testReimbursement = new Reimbursement("david",1000);
        Reimbursement result = reimbursementDAO.createReimbursement(testReimbursement);
        Assert.assertNotNull(result.getId());
    }
}
