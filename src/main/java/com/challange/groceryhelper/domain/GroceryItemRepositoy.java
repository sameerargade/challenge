/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author SArgade
 */
public interface GroceryItemRepositoy extends JpaRepository<GroceryItem, Long> {
    
}
