/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.groceryhelper.service;

import com.challange.groceryhelper.domain.GroceryItem;
import com.challange.groceryhelper.domain.GroceryItemRepository;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *
 * @author SArgade
 */
@SpringBootTest
public class GroceryHelperServiceTest {

    //@Autowired
    @Autowired
    GroceryItemRepository groceryItemRepository;

    @Test
    void getAllGroceryItems() {
        // groceryItemRepository.deleteAll();
        GroceryItem groceryItem = new GroceryItem(1L, "Milo", "Energy");
        groceryItemRepository.save(groceryItem);
        GroceryHelperService groceryHelperService;
        groceryHelperService = new GroceryHelperServiceImpl(groceryItemRepository);

        List<GroceryItem> groceryItems = groceryHelperService.findAllGroceryItems();
        GroceryItem lastgroceryItem = groceryItems.get(0);

        assertEquals(groceryItem.getName(), lastgroceryItem.getName());
        // assertEquals(groceryItem.isCompleted(), lastToDo.isCompleted());
        assertEquals(groceryItem.getId(), lastgroceryItem.getId());
    }

    @Test
    void saveAGroceryItem() {
        //groceryItemRepository.deleteAll();
        GroceryHelperService groceryHelperService;
        groceryHelperService = new GroceryHelperServiceImpl(groceryItemRepository);
        GroceryItem groceryItem = new GroceryItem(4L, "Horlics", "Energy");
        // groceryItemRepository.save(groceryItem);
        groceryHelperService.saveGroceryItem(groceryItem);

        assertEquals(1.0, groceryItemRepository.count());
    }
//    @AfterEach
//    void tearDown(){
//        groceryItemRepository.deleteAll();
//    }
}
