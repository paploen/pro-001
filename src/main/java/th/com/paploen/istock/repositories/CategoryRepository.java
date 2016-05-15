/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.com.paploen.istock.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import th.com.paploen.istock.model.Category;

/**
 *
 * @author User
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
