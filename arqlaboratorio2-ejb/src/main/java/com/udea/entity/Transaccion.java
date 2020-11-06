/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alejandro Rios
 */
@Entity
@Table(name = "TRANSACCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findById", query = "SELECT t FROM Transaccion t WHERE t.id = :id")
    , @NamedQuery(name = "Transaccion.findByNombre", query = "SELECT t FROM Transaccion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Transaccion.findByCedula", query = "SELECT t FROM Transaccion t WHERE t.cedula = :cedula")
    , @NamedQuery(name = "Transaccion.findByCorreo", query = "SELECT t FROM Transaccion t WHERE t.correo = :correo")
    , @NamedQuery(name = "Transaccion.findByNumerotarjeta", query = "SELECT t FROM Transaccion t WHERE t.numerotarjeta = :numerotarjeta")
    , @NamedQuery(name = "Transaccion.findByCvv", query = "SELECT t FROM Transaccion t WHERE t.cvv = :cvv")
    , @NamedQuery(name = "Transaccion.findByFecha", query = "SELECT t FROM Transaccion t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Transaccion.findByMesvencimiento", query = "SELECT t FROM Transaccion t WHERE t.mesvencimiento = :mesvencimiento")
    , @NamedQuery(name = "Transaccion.findByA\u00f1ovencimiento", query = "SELECT t FROM Transaccion t WHERE t.a\u00f1ovencimiento = :a\u00f1ovencimiento")
    , @NamedQuery(name = "Transaccion.findByValortransaccion", query = "SELECT t FROM Transaccion t WHERE t.valortransaccion = :valortransaccion")})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 10)
    @Column(name = "CEDULA")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "NUMEROTARJETA")
    private String numerotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVV")
    private int cvv;
    @Basic(optional = true)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MESVENCIMIENTO")
    private int mesvencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "A\u00d1OVENCIMIENTO")
    private int añovencimiento;
    @Column(name = "VALORTRANSACCION")
    private Integer valortransaccion;

    public Transaccion() {
    }

    public Transaccion(Integer id) {
        this.id = id;
    }

    public Transaccion(Integer id, String nombre, String correo, String numerotarjeta, int cvv, Date fecha, int mesvencimiento, int añovencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.numerotarjeta = numerotarjeta;
        this.cvv = cvv;
        this.fecha = fecha;
        this.mesvencimiento = mesvencimiento;
        this.añovencimiento = añovencimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMesvencimiento() {
        return mesvencimiento;
    }

    public void setMesvencimiento(int mesvencimiento) {
        this.mesvencimiento = mesvencimiento;
    }

    public int getAñovencimiento() {
        return añovencimiento;
    }

    public void setAñovencimiento(int añovencimiento) {
        this.añovencimiento = añovencimiento;
    }

    public Integer getValortransaccion() {
        return valortransaccion;
    }

    public void setValortransaccion(Integer valortransaccion) {
        this.valortransaccion = valortransaccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Transaccion[ id=" + id + " ]";
    }
    
}
