/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.order;

import com.lab.user.User;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Trung
 */
public class OrderViewTest {

    public OrderViewTest() {

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
    public void testViewOrderByGroup_HashMap1() throws Exception {
        System.out.println("viewOrderByGroup");
        HashMap<String, Double> map = new HashMap<>();
        HashMap<String, Double> map1 = null;
        map.put("admin01", 8000.0);
        map.put("sale1", 1000.0);
        map.put("sale01", 30000.0);
        map.put("sale02", 9000.0);

        OrderView instance = new OrderView();
        map1 = (HashMap<String, Double>) instance.viewOrderByGroup1();
        assertEquals(map1, map);
        fail("Test faild");
    }

    @Test
    public void testViewOrderByGroup_HashMap2() throws Exception {
        System.out.println("viewOrderByGroup");
        HashMap<String, Double> map = new HashMap<>();
        HashMap<String, Double> map1 = null;
        map.put("admin01", 8000.0);
        map.put("sale1", 1000.0);
        map.put("sale01", 30000.0);
        map.put("sale02", null);

        OrderView instance = new OrderView();
        map1 = (HashMap<String, Double>) instance.viewOrderByGroup1();
        assertEquals(map1, map);

    }

}
