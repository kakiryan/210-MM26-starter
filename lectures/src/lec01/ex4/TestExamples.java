package lec01.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestExamples {

    @Test
    public void testOnePlusOne(){
        assertEquals(1, 1);
    }

    @Test
    public void testPointGetX(){
        Point p = new CartesianPoint(3, 5);
        double actual = p.getX();
        double expected = 3;
        assertEquals(expected, actual, 0.001);
    }
}
