/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import cst8218.base0001.presentation.SpriteColorConverter;
import java.awt.Color;
import javax.faces.component.UIData;
import javax.faces.context.FacesContextWrapper;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;

/**
 *
 * @author Frederic
 */
public class ColorConverterTest {
    
    public ColorConverterTest() {
    }
    
    //@BeforeAll
    public static void setUpClass() {
    }
    
    //@AfterAll
    public static void tearDownClass() {
    }
    
    //@BeforeEach
    public void setUp() {
    }
    
    //@AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testColorConverterToObject() {
        SpriteColorConverter converter = new SpriteColorConverter();
        
        Color returnedColor = (Color) converter.getAsObject(new FacesContextWrapper(){}, new UIData(), "#050505");
        
        assertEquals(returnedColor, new Color(5,5,5));
    }
    
    @Test
    public void testColorConverterToObjectFail() {
        SpriteColorConverter converter = new SpriteColorConverter();
        
        Color returnedColor = (Color) converter.getAsObject(new FacesContextWrapper(){}, new UIData(), "#054525");
        
        assertEquals(returnedColor, new Color(5,5,5));
    }
    
    @Test
    public void testColorConverterToString() {
        SpriteColorConverter converter = new SpriteColorConverter();
        Color objectColor = new Color(2,4,6);
        
        String stringColor = converter.getAsString(new FacesContextWrapper(){}, new UIData(), objectColor);
        
        assertEquals(stringColor, "#020406");
    }
    
    @Test
    public void testColorConverterToStringFail() {
        SpriteColorConverter converter = new SpriteColorConverter();
        Color objectColor = new Color(2,4,6);
        
        String stringColor = converter.getAsString(new FacesContextWrapper(){}, new UIData(), objectColor);
        
        assertEquals(stringColor, "#020410");
    }
    
}