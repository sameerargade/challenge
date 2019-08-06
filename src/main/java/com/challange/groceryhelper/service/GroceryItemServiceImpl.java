/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.service;

import com.challange.groceryhelper.domain.GroceryItem;
import com.challange.groceryhelper.domain.GroceryItemRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SArgade
 */
@Service
public class GroceryItemServiceImpl implements GroceryItemService{
    
    @Autowired
    GroceryItemRepositoy repository;

    @Override
    public Boolean saveGroceryItem(GroceryItem groceryItem) {
        try{
             groceryItem = repository.save(groceryItem);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
      //To change body of generated methods, choose Tools | Templates.
      
       return true;
    }

    @Override
    public Boolean deleteGroceryItem(GroceryItem groceryItem) {
        try{
        repository.delete(groceryItem);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
