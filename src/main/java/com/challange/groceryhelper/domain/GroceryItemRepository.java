/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SArgade
 */
@Repository("GroceryItemRepository")
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
 
   GroceryItem findByName(String name);   
}
