package th.com.paploen.istock.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "unit")
public class Unit {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "unit_id")
     private Integer id;

     @Column(name = "name", nullable = false)
     private String name;

     @Column(name = "date")
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date unitDate;

     @Column(name = "time")
     @Temporal(javax.persistence.TemporalType.TIME)
     private Date unitTime;

     public Unit() {
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Date getUnitDate() {
          return unitDate;
     }

     public void setUnitDate(Date unitDate) {
          this.unitDate = unitDate;
     }

     public Date getUnitTime() {
          return unitTime;
     }

     public void setUnitTime(Date unitTime) {
          this.unitTime = unitTime;
     }

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 59 * hash + Objects.hashCode(this.id);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Unit other = (Unit) obj;
          if (!Objects.equals(this.name, other.name)) {
               return false;
          }
          if (!Objects.equals(this.id, other.id)) {
               return false;
          }
          if (!Objects.equals(this.unitDate, other.unitDate)) {
               return false;
          }
          if (!Objects.equals(this.unitTime, other.unitTime)) {
               return false;
          }
          return true;
     }

     

}
