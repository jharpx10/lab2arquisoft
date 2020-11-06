package com.udea.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-06T17:30:03")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Date> fecha;
    public static volatile SingularAttribute<Transaccion, Integer> cvv;
    public static volatile SingularAttribute<Transaccion, String> numerotarjeta;
    public static volatile SingularAttribute<Transaccion, String> cedula;
    public static volatile SingularAttribute<Transaccion, String> correo;
    public static volatile SingularAttribute<Transaccion, Integer> mesvencimiento;
    public static volatile SingularAttribute<Transaccion, Integer> añovencimiento;
    public static volatile SingularAttribute<Transaccion, Integer> id;
    public static volatile SingularAttribute<Transaccion, String> nombre;
    public static volatile SingularAttribute<Transaccion, Integer> valortransaccion;

}