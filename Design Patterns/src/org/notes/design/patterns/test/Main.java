package org.notes.design.patterns.test;

import org.junit.jupiter.api.*;
import org.notes.design.patterns.creational.*;

import static org.notes.design.patterns.creational.DemoSingleton.*;

public class Main {
    @Test
    public void testDemoSingleton() {
        DemoSingleton<String> demoSingletonInstance = getDemoSingletonInstance();
        demoSingletonInstance.setT("test1");
        DemoSingleton<String> demoSingletonsecondInstance = getDemoSingletonInstance();
        demoSingletonsecondInstance.setT("test2");
        Assertions.assertEquals(demoSingletonInstance.getT(), demoSingletonsecondInstance.getT());
    }

}
