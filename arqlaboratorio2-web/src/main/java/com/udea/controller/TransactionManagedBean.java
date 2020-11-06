/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entity.Transaccion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author Alejandro Rios
 */
public class TransactionManagedBean {

    @EJB
    private com.udea.session.TransactionManagerLocal transactionManager;

    private Transaccion transaccion;

    /**
     * Get the value of transaccion
     *
     * @return the value of transaccion
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * Set the value of transaccion
     *
     * @param transaccion new value of transaccion
     */
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * Creates a new instance of TransactionManagedBean
     */
    public TransactionManagedBean() {
        transaccion = new Transaccion();
    }
    
 

/**
* Action handler -
* @return
*/
public String insert() {
transactionManager.insertTransaction(transaccion);
 return "INSERTED";
}
    
}
