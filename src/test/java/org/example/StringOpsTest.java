package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOpsTest {
    StringOps stringOps;

    @Before
    public void initiateClass() {
        this.stringOps = new StringOps();
    }

    @Test
    public void Test1RemoveA() {
        assertEquals("BCD", stringOps.removeA("ABCD"));
    }

    @Test
    public void Test2RemoveA() {
        assertEquals("BCD", stringOps.removeA("AABCD"));
    }

    @Test
    public void Test3RemoveA() {
        assertEquals("", stringOps.removeA("AA"));
    }

    @Test
    public void Test4RemoveA() {
        assertEquals("", stringOps.removeA("A"));
    }

    @Test
    public void Test5RemoveA() {
        assertEquals("", stringOps.removeA(""));
    }

    @Test
    public void Test6RemoveA() {
        assertEquals("BABA", stringOps.removeA("ABABA"));
    }

    @Test
    public void Test7RemoveA() {
        assertEquals("ABA", stringOps.removeA("AAABA"));
    }

    @Test
    public void Test8RemoveA() {
        assertEquals("BCD", stringOps.removeA("BACD"));
    }

    @Test
    public void Test9RemoveA() {
        assertEquals("BBAA", stringOps.removeA("BBAA"));
    }
}
