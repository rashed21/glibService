package com.programmer.gate.model;
// Generated May 16, 2018 4:56:40 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Us002Id generated by hbm2java
 */
@Embeddable
public class Us002Id  implements java.io.Serializable {


     private BigDecimal id;
     private BigDecimal roleId;

    public Us002Id() {
    }

    public Us002Id(BigDecimal id, BigDecimal roleId) {
       this.id = id;
       this.roleId = roleId;
    }
   


    @Column(name="ID", nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }


    @Column(name="ROLE_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Us002Id) ) return false;
		 Us002Id castOther = ( Us002Id ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRoleId()==castOther.getRoleId()) || ( this.getRoleId()!=null && castOther.getRoleId()!=null && this.getRoleId().equals(castOther.getRoleId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRoleId() == null ? 0 : this.getRoleId().hashCode() );
         return result;
   }   


}

