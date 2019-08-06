/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.service;

import com.challange.groceryhelper.domain.GroceryItem;
import java.util.List;

/**
 *
 * @author SArgade
 */
public interface GroceryHelperService {
    
    public GroceryItem saveGroceryItem(GroceryItem groceryItem);
    
    public GroceryItem findGroceryItemByName(String groceryItemName);
    
    public Boolean deleteGroceryItem(GroceryItem groceryItem);
    public List<GroceryItem> findAllGroceryItems();
}
