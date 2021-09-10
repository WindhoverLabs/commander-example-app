package org.windhoverlabs.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleObjectTest {

    @Test
    void ExampleObjectNameTest() {
        String name = "Steve";
        ExampleObject obj = new ExampleObject(name);
        
        assertEquals(name, obj.getName());
    }

}
