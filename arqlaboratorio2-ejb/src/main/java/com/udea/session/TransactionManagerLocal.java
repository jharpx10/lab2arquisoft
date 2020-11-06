/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Transaccion;
import javax.ejb.Local;

/**
 *
 * @author Alejandro Rios
 */
@Local
public interface TransactionManagerLocal {

    void insertTransaction(Transaccion transaccion);

    void d(String s);

   
    
}
