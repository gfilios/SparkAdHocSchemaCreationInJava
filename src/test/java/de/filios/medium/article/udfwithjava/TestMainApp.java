package de.filios.medium.article.udfwithjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


public class TestMainApp {

    @Test
    @DisplayName("Test: Is the Main App available and show Greeting")
    @Order(0)
    public void testHasAppGreeting (){
        MainApp app  = new MainApp();
        assertEquals("Salve - Main App",app.getGreeting());
    }
}