package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testImplementation(){
        Student student = new Student(1L,"Bailey");
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        Student student = new Student(2L, "Mocha");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(1L,"Bailey");
        student.learn(2.0);

        Double expected = 2.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);



    }

}