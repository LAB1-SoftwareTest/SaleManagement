
package com.lab.user;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserViewTest {
    
    public UserViewTest() {
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
    
    @After
    public void tearDown() {
    }

   

//    @Test
//    public void testLoginCorrect() throws IOException {
//        System.out.println("login");
//        String a = "admin01";
//        String b = "admin01";
//        UserView instance = new UserView();
//        Boolean expResult = true;
//        Boolean result = instance.login(a, b);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testLoginWrongUserPass() throws IOException {
//        System.out.println("login");
//        String a = "admin";
//        String b = "admin123";
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.login(a, b);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testLoginWrongUser() throws IOException {
//        System.out.println("login");
//        String a = "admin";
//        String b = "admin01";
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.login(a, b);
//        assertEquals(expResult, result);
//    }
//   
    @Test
    public void testLoginWrongPassWord() throws IOException {
        System.out.println("login");
        String a = "admin01";
        String b = "123";
        UserView instance = new UserView();
        Boolean expResult = false;
        Boolean result = instance.login(a, b);
        assertEquals(expResult, result);
    }
    
//    @Test
//    public void testLoginEmpty() throws IOException {
//        System.out.println("login");
//        String a = "";
//        String b = "";
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.login(a, b);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testLoginNull() throws IOException {
//        System.out.println("login");
//        String a = null;
//        String b = null;
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.login(a, b);
//        assertEquals(expResult, result);
//    }
//    
//    
//    
//    @Test
//    public void testChangePassword() throws IOException {
//        System.out.println("changePassword");
//        UserView instance = new UserView();
//        Boolean expResult = true;
//        Boolean result = instance.changePassword("admin01", "admin123", "admin123");
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testChangePasswordJustNumber() throws IOException {
//        System.out.println("changePassword");
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.changePassword("admin01", "123", "123");
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testChangePasswordJustChar() throws IOException {
//        System.out.println("changePassword");
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.changePassword("admin01", "abc", "abc");
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testChangePasswordLessThan6Character() throws IOException {
//        System.out.println("changePassword");
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.changePassword("admin01", "abc1", "abc1");
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testChangePasswordNewReNewNotEqual() throws IOException {
//        System.out.println("changePassword");
//        UserView instance = new UserView();
//        Boolean expResult = false;
//        Boolean result = instance.changePassword("admin01", "abc1", "admin");
//        assertEquals(expResult, result);
//    }
}
