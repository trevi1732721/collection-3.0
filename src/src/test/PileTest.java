package src.test;

import liste.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {
    Pile test = new Pile();
    @BeforeEach
    void setUp() {
        test = new Pile<String>();
        for(int i=0;i<3;i++){
            test.push("TEST "+ i);
        }
    }

    @Test
    void push() {
            test.push("essaie 1");
            assertEquals(4,test.size());
    }

    @Test
    void pop() {
        test.pop();
        assertEquals(2,test.size());
        assertEquals("TEST 1", test.peek());
    }

    @Test
    void peek() {
        test.peek();
        assertEquals(3,test.size());
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0,test.size());
    }

    @Test
    void size() {
            assertEquals(3,test.size());
            test.push("hello world");
            assertEquals(4,test.size());
    }

}