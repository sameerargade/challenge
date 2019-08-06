/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.service;

import com.challange.groceryhelper.domain.GroceryItem;

/**
 *
 * @author SArgade
 */
public interface GroceryItemService {
    
    public Boolean saveGroceryItem(GroceryItem groceryItem);
    
    public Boolean deleteGroceryItem(GroceryItem groceryItem);
    
}
