package com.josh.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JLinkedListTest {
    public JLinkedListTest() {

    }

    @Test
    public void testCheck() {
        assertEquals(new JLinkedList().check(1), 2);
    }
}
