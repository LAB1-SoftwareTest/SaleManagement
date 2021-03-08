/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.product;

import java.io.IOException;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ProductControllerTest_Thai {

    public ProductControllerTest_Thai() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deleteProduct method, of class ProductController.
     */
    @Test
    public void testDeleteProduct1() throws IOException {
        System.out.println("* ProductViewTest3: test method 2 - testDeleteProduct()");
        ProductController instance = new ProductController();
        assertEquals("Delete Successful !!!", instance.deleteProduct(1));
    }

    @Test
    public void testDeleteProduct2() throws IOException {
        System.out.println("* ProductViewTest4: test method 2 - testDeleteProduct()");
        ProductController instance = new ProductController();
        assertEquals("Delete Fail !!!", instance.deleteProduct(2));
    }

    /**
     * Test of updateProduct method, of class ProductController.
     */
    @Test
    public void testUpdateProduct1() throws IOException {
        System.out.println("* ProductViewTest5: test method 3 - testUpdateProduct()");
        ProductController instance = new ProductController();
        assertEquals("Update Successful !!!", instance.updateProduct(new Product(1, "ban chai", 1.2, 2, "viet nam")));
    }

    @Test
    public void testUpdateProduct2() throws IOException {
        System.out.println("* ProductViewTest6: test method 3 - testUpdateProduct()");
        ProductController instance = new ProductController();
        assertEquals("Update Fail !!!", instance.updateProduct(new Product(2, "ban chai", 1.2, 2, "viet nam")));
    }
}
