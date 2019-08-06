/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.contoller;

import com.challange.groceryhelper.domain.GroceryItem;
import com.challange.groceryhelper.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SArgade
 */
@RestController
public class GroceryItemController {
    
    @Autowired
    GroceryItemService groceryItemService;
    
     
    @RequestMapping("/")
    public ResponseEntity index() {
        return new ResponseEntity("",HttpStatus.OK);
    }
    @RequestMapping( value = "/saveGroceryItem", method = RequestMethod.POST )
    public ResponseEntity saveGroceryItem(GroceryItem groceryItem){
    
       Boolean result = groceryItemService.saveGroceryItem(groceryItem);
       if(result){
            return new ResponseEntity("",HttpStatus.OK);
       }
        return new ResponseEntity("",HttpStatus.EXPECTATION_FAILED);
    }
    
}
