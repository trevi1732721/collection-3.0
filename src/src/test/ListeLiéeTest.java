package src.test;

import liste.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Trevi1732721 on 2018-03-29.
 */
class ListeLiéeTest {
    ListeLiée<String> test;
    @BeforeEach
    void setUp() {
        test = new ListeLiée<String>();
        for(int i=0;i<3;i++){
            test.add("TEST "+ i);
        }
    }

    @Test
    void add() {
        test.add("essaie 1");
        test.add("essaie 2");
        assertEquals("TEST 0",test.get(0));
        assertEquals("TEST 1",test.get(1));
        assertEquals("TEST 2",test.get(2));
        assertEquals("essaie 1",test.get(3));
        assertEquals("essaie 2",test.get(4));
    }

    @Test
    void add1() {
        test.add(0,"essaie 1");
        assertEquals("essaie 1",test.get(0));
        assertEquals("TEST 0",test.get(1));
        assertEquals("TEST 1",test.get(2));
        assertEquals("TEST 2",test.get(3));

    }

    @Test
    void set() {
        test.set(1,"essaie 1");
        assertEquals("essaie 1",test.get(1));
    }

    @Test
    void get() {
        assertEquals("TEST 0",test.get(0));
        assertEquals("TEST 1",test.get(1));
        assertEquals("TEST 2",test.get(2));
    }

    @Test
    void remove() {
        test.remove(1);
        assertEquals("TEST 0",test.get(0));
        assertEquals("TEST 2",test.get(1));
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(null,test.get(0));
        assertEquals(0,test.size());
    }

    @Test
    void size() {
        assertEquals(3,test.size());
    }
}