package com.pulando;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FrogJumpingTest {

    private int[] input;
    private int expected;

    public FrogJumpingTest(int[] a, int expected) {
        this.input = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 2, -1}, 4},
                {new int[]{1, 2, 3, 1, -2, 1}, 6},
                {new int[]{1, 1, 1, 1}, 4},
                {new int[]{-3}, 1},
        });
    }

    @Test
    public void should_test_solution() {
        Assert.assertEquals(Arrays.toString(input), expected, FrogJumping.solution(input));
    }
}