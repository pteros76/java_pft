package ru.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPoint {


    @Test
    public void testDistance()
    {
        Point p2= new Point(9,9);
        Point p1 = new Point(6,5);

        double dist = Point.distance(p1,p2);
        Assert.assertEquals(dist,5);

    }
}
