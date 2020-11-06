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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alejandro Rios
 */
public class TransactionManagedBean {

    @EJB
    private com.udea.session.TransactionManagerLocal transactionManager;
   
    private String cardtype;

    /**
     * Get the value of cardtype
     *
     * @return the value of cardtype
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * Set the value of cardtype
     *
     * @param cardtype new value of cardtype
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

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
        cardtype="";
        transaccion = new Transaccion();
    }

    /**
     * Action handler -
     *
     * @return
     */
    public String insert() {
        transactionManager.insertTransaction(transaccion);
        return "INSERTED";
    }
/**
     * Action handler -
     *
     * @return
     */
    public String validar() {
      
        String sCadena, sSubCadena;
        sCadena = String.valueOf(transaccion.getNumerotarjeta());
        sSubCadena = sCadena.substring(0, 5);
        int val = Integer.parseInt(sSubCadena);
        if (val >= 11111 && val <= 22222) {
            cardtype="American Express";
        } else if (val >= 33334 && val <= 44444) {
            cardtype="Diners";
        }else if (val >= 77777 && val <= 88888) {
            cardtype="Mastercard";
        }
        else if (val >= 55555 && val <= 66666) {
            cardtype="Visa";
        }else{
        cardtype="Tarjeta no encontrada";
        }
        return null;
    }

}
