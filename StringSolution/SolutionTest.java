package com.company.StringSolution;

import com.company.StringSolution.WhoLikesIt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.Solution());
        assertEquals("Peter likes this", WhoLikesIt.Solution("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.Solution("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.Solution("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.Solution("Alex", "Jacob", "Mark", "Max"));
    }
}