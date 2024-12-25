package oop.labs.lab2;

import static oop.labs.lab2.tools.TestUtils.testOut;

public class TestingManual
{
    public static void main(String[] args)
    {

        var m1 = new IntMatrixImmutable(new int[][]{{2,3},{3,4},{4,5}});
        var m2 = new IntMatrixMutable(new int[][]{{2,3,4},{3,4,5}});
        var m3 = m1.dot(m2);
        var m4 = new IntMatrixMutable(m2);
        var m5 = new IntMatrixMutable(m1);
        testOut(m1.equals(m5));
        testOut(m2.equals(m4));
        testOut(m2);
        testOut(m4);

        m4.set(1,1,-100);
        testOut(m2);
        testOut(m4);








    }
}
