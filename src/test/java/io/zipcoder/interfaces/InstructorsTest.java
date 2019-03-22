package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
    Instructors instructors = Instructors.getInstance();
    Instructors instructors1 = Instructors.getInstance();
    Assert.assertSame(instructors,instructors1);
    }
}