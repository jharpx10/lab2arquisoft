/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Transaccion;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alejandro Rios
 */
@Stateless
public class TransactionManager implements TransactionManagerLocal {

   @PersistenceContext(name= "com.udea.arqlab_arqlaboratorio2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void insertTransaction(Transaccion transaccion) {
        transaccion.setFecha(new Date());
        transaccion.setId(34);
        em.persist(transaccion);
    }

    @Override
    public void d(String s) {
        System.out.println(s);
        int i=0;
    }
    
  

}
