package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void getInstanceTest() {
       Students student = Students.getInstance();
       Students student1 = Students.getInstance();
        Assert.assertSame(student,student1);
    }
}