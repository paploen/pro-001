/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.com.paploen.istock.controller;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import th.com.paploen.istock.repositories.CategoryRepository;

/**
 *
 * @author User
 */
@Component
@Scope("view")
public class CategoryController implements Serializable{
    
    @Autowired
    private CategoryRepository CategoryRepository;
    
    private String name;
    
    public void setCategory(String name){
        this.name = name;
    }
    
    public void onSave(){
        System.out.println("Name TEST :: " + name);
    }
}
