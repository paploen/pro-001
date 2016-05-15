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

@Entity
@Table(name = "category")
public class Category {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "category_id")
     private Integer id;

     @Column(name = "name", nullable = false)
     private String name;

     @Column(name = "date")
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date categoryDate;

     @Column(name = "time")
     @Temporal(javax.persistence.TemporalType.TIME)
     private Date categoryTime;

     public Category() {
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

     public Date getCategoryDate() {
          return categoryDate;
     }

     public void setCategoryDate(Date categoryDate) {
          this.categoryDate = categoryDate;
     }

     public Date getCategoryTime() {
          return categoryTime;
     }

     public void setCategoryTime(Date categoryTime) {
          this.categoryTime = categoryTime;
     }

     @Override
     public int hashCode() {
          int hash = 3;
          hash = 37 * hash + Objects.hashCode(this.id);
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
          final Category other = (Category) obj;
          if (!Objects.equals(this.name, other.name)) {
               return false;
          }
          if (!Objects.equals(this.id, other.id)) {
               return false;
          }
          if (!Objects.equals(this.categoryDate, other.categoryDate)) {
               return false;
          }
          if (!Objects.equals(this.categoryTime, other.categoryTime)) {
               return false;
          }
          return true;
     }
     
     

}
