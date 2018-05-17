package com.programmer.gate.model;
// Generated May 16, 2018 4:56:40 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Us002 generated by hbm2java
 */
@Entity
@Table(name="US002"
    ,schema="GLIB"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Us002  implements java.io.Serializable {


     private Us002Id id;
     private Us001 us001;
     private String userName;
     private String firstName;
     private String lastName;
     private String contactNo;
     private String EMail;
     private String password;
     private BigDecimal statusId;
     private Date entryDate;
     private Date updteDate;

    public Us002() {
    }

	
    public Us002(Us002Id id, Us001 us001) {
        this.id = id;
        this.us001 = us001;
    }
    public Us002(Us002Id id, Us001 us001, String userName, String firstName, String lastName, String contactNo, String EMail, String password, BigDecimal statusId, Date entryDate, Date updteDate) {
       this.id = id;
       this.us001 = us001;
       this.userName = userName;
       this.firstName = firstName;
       this.lastName = lastName;
       this.contactNo = contactNo;
       this.EMail = EMail;
       this.password = password;
       this.statusId = statusId;
       this.entryDate = entryDate;
       this.updteDate = updteDate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="roleId", column=@Column(name="ROLE_ID", nullable=false, precision=22, scale=0) ) } )
    public Us002Id getId() {
        return this.id;
    }
    
    public void setId(Us002Id id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ROLE_ID", nullable=false, insertable=false, updatable=false)
    public Us001 getUs001() {
        return this.us001;
    }
    
    public void setUs001(Us001 us001) {
        this.us001 = us001;
    }

    
    @Column(name="USER_NAME", length=20)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="FIRST_NAME", length=20)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="LAST_NAME", length=20)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="CONTACT_NO", length=15)
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    
    @Column(name="E_MAIL", length=30)
    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    
    @Column(name="PASSWORD", length=12)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="STATUS_ID", precision=22, scale=0)
    public BigDecimal getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(BigDecimal statusId) {
        this.statusId = statusId;
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
    @Column(name="UPDTE_DATE", length=7)
    public Date getUpdteDate() {
        return this.updteDate;
    }
    
    public void setUpdteDate(Date updteDate) {
        this.updteDate = updteDate;
    }




}


