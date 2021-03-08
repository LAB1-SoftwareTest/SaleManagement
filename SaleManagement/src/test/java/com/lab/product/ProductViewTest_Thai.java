/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.product;

import com.lab.order.Order;
import com.lab.role.UserRole;
import com.lab.user.User;
import com.lab.utilities.OrderDataIO;
import com.lab.utilities.ProductDataIO;
import com.lab.utilities.UserDataIO;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertEquals;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Trung
 */
public class ProductViewTest_Thai {

    List<User> listUsers = null;
    List<Order> listOrders = null;
    List<Product> listProducts = null;
    List<Product> listProducts1 = null;
    List<Product> listProducts2 = null;

    UserDataIO u = null;
    ProductDataIO p = null;
    OrderDataIO o = null;

    public void initData() throws IOException {

    }

    public ProductViewTest_Thai() throws IOException {
        listUsers = new ArrayList<>();
        listOrders = new ArrayList<>();
        listProducts = new ArrayList<>();
        listProducts1 = new ArrayList<>();
        listProducts2 = new ArrayList<>();

        u = new UserDataIO();
        p = new ProductDataIO();
        o = new OrderDataIO();

        initData();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testDisplayProduct1() {
        System.out.println("* ProductViewTest1: test method 1 - testDisplayProduct()");
        ArrayList<Product> demo = new ArrayList<Product>();
        demo.add(new Product(1, "ban chai", 1.2, 2, "viet nam"));
        assertEquals("----------------------------------------------------------------------------\n"
                + "|        id|                name|     price|  quantity|              origin|\n"
                + "|         1|            ban chai|      1.20|         2|            viet nam|\n"
                + "----------------------------------------------------------------------------\n", ProductView.displayProduct(demo));
    }

    @Test
    public void testDisplayProduct2() {
        System.out.println("* ProductViewTest2: test method 1 - testDisplayProduct()");
        ArrayList<Product> demo = null;
        assertEquals("----------------------------------------------------------------------------\n"
                + "==> LIST IS EMPTY\n"
                + "----------------------------------------------------------------------------\n", ProductView.displayProduct(demo));
    }
   
    
}
