package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor instructor;
    Student student;
    Student student1;
    Student student2;
    @Before
    public void setUp(){
        instructor = new Instructor(1L,"Buters");
        student = new Student(2L,"Bailey");
        student1 = new Student(3L,"Mocha");
        student2 = new Student(4L,"Jelly");

    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test

    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(1L,"Bailey");
        instructor.teach(student, 2.0);
        Double expected = 2.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLecture(){
       Student[] students = {student,student1,student2};
       instructor.lecture(students,9);
       Double expected = 3.0;
       Double actual = student.getTotalStudyTime();
       Assert.assertEquals(expected,actual);
    }
}