package de.filios.medium.article.udfwithjava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMainApp {

    @Test
    @DisplayName("Test: Is the Main App available and show Greeting")
    @Order(0)
    public void testHasAppGreeting (){
        MainApp app  = new MainApp();
        assertEquals("Main App - is App and running",app.getGreeting());
    }
}
