package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    Educator educator = Educator.NHU;
    Student student = new Student(2L, "Bailey");
    Student student1 = new Student(3L, "Mocha");
    Student student2 = new Student(4L, "Jelly");

    @Before
    public void setup(){
        educator.clearTimeWorked();
    }

    @Test
    public void testTeach() {
        Student student = new Student(1L, "Bailey");
        educator.teach(student, 2.0);
        Double expected = 2.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Student[] students = {student, student1, student2};
        educator.lecture(students, 9);
        Double expected = 3.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTimeWorked(){
        Student student = new Student(1L, "Bailey");
        educator.teach(student,9);
        educator.teach(student,9);
        Double expected = 18.0;
        Double actual = educator.gettimeWorked();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTimeWorked1(){
        Student[] students = {student, student1, student2};
        educator.lecture(students,9);
        educator.lecture(students,9);
        Double expected = 18.0;
        Double actual = educator.gettimeWorked();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTimeWorked2(){
        Student[] students = {student, student1, student2};
        educator.teach(student,5);
        educator.lecture(students,9);
        Double expected = 14.0;
        Double actual = educator.gettimeWorked();
        Assert.assertEquals(expected,actual);
    }



}