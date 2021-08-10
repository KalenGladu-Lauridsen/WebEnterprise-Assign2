/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import cst8218.base0001.entity.Sprite;
import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frederic
 */
public class SpriteTest {
    
    public SpriteTest() {
    }
    
    //@BeforeClass
    public static void setUpClass() {
    }
    
    //@AfterClass
    public static void tearDownClass() {
    }
    
    //@Before
    public void setUp() {
    }
    
    //@After
    public void tearDown() {
    }


    @Test
    public void compareWidth() {
        Sprite testSprite = new Sprite(2,5); // testing Constructor with 2 parqms
        
        assertEquals(testSprite.getPanelWidth(), 5);
    }
    @Test
    public void compareHeigth() {
        Sprite testSprite = new Sprite(2,5); // testing Constructor with 2 params
        
        assertEquals(testSprite.getPanelHeight(), 2);
    }
    
    @Test
    public void compareColor() {
        Color testColor = new  Color(25,200,54); // testing Constructor with 3 params
        
        Sprite testSprite = new Sprite(2,5, testColor);
        
        assertEquals(testSprite.getColor(), testColor);
    }
    
    
}