package th.com.paploen.istock.model;


import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_name")
public class NameTable{
     
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
     @Column(unique = true)
     private String name;

          
     public NameTable() {
     }
     
     public Long getId(){
          return id;
     }
     
     public void setId(Long id){
          this.id = id;
     }
     
     public String getName(){
          return name;
     }
     
     public void setName(String name){
          this.name = name;
     }

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 47 * hash + Objects.hashCode(this.id);
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
          final NameTable other = (NameTable) obj;
          if (!Objects.equals(this.id, other.id)) {
               return false;
          }
          return true;
     }
     
     
}
