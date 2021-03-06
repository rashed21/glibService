package com.programmer.gate.model;
// Generated May 22, 2018 3:27:56 PM by Hibernate Tools 3.6.0


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * St001 generated by hbm2java
 */
@Entity
@Table(name="ST001"
    ,schema="GLIB"
)
public class St001  implements java.io.Serializable {


     private int id;
     private String code;
     private String name;
     private String defination;
     private Date entryDate;
     private Date upDate;
     private String entryUser;

    public St001() {
    }

	
    public St001(int id) {
        this.id = id;
    }
    public St001(int id, String code, String name, String defination, Date entryDate, Date upDate, String entryUser) {
       this.id = id;
       this.code = code;
       this.name = name;
       this.defination = defination;
       this.entryDate = entryDate;
       this.upDate = upDate;
       this.entryUser = entryUser;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="CODE", length=20)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="NAME", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="DEFINATION", length=20)
    public String getDefination() {
        return this.defination;
    }
    
    public void setDefination(String defination) {
        this.defination = defination;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ENTRY_DATE", length=7)
    public Date getEntryDate() {
        return this.entryDate;
    }
    
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="UP_DATE", length=7)
    public Date getUpDate() {
        return this.upDate;
    }
    
    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    
    @Column(name="ENTRY_USER", length=20)
    public String getEntryUser() {
        return this.entryUser;
    }
    
    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }




}


