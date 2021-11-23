package com.company.highAndLow;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void test1() {
        assertEquals("42 -9", highAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}