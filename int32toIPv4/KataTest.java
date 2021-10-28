package com.company.int32toIPv4;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void sampleTest() {
        assertEquals("127.62.118.114", Kata.longToIP(2134799986));
        assertEquals("0.0.0.0", Kata.longToIP(0));
        assertEquals("128.32.10.1", Kata.longToIP(2149583361L));
    }
}