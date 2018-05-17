package com.programmer.gate.model;
// Generated May 16, 2018 4:56:40 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Us001 generated by hbm2java
 */
@Entity
@Table(name="US001"
    ,schema="GLIB"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Us001  implements java.io.Serializable {


     private BigDecimal id;
     private String code;
     private String role;
     private BigDecimal statusId;
     private String entryDate;
     private Date updateDate;
     private BigDecimal updateUser;

    public Us001() {
    }

	
    public Us001(BigDecimal id) {
        this.id = id;
    }
    public Us001(BigDecimal id, String code, String role, BigDecimal statusId, String entryDate, Date updateDate, BigDecimal updateUser) {
       this.id = id;
       this.code = code;
       this.role = role;
       this.statusId = statusId;
       this.entryDate = entryDate;
       this.updateDate = updateDate;
       this.updateUser = updateUser;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="CODE", length=4)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="ROLE", length=20)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    
    @Column(name="STATUS_ID", precision=22, scale=0)
    public BigDecimal getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(BigDecimal statusId) {
        this.statusId = statusId;
    }

    
    @Column(name="ENTRY_DATE", length=20)
    public String getEntryDate() {
        return this.entryDate;
    }
    
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="UPDATE_DATE", length=7)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    
    @Column(name="UPDATE_USER", precision=22, scale=0)
    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
    }

}

