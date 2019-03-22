package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    Instructor instructor = new Instructor(1L, "Pie");
    Student student = new Student(1L,"Apple");
    Student student1 = new Student(2L,"Pumpkin");
    Student student2 = new Student(3L, "Cheese");
    Students students = Students.getInstance();
    ZipCodeWilmington code = new ZipCodeWilmington(students);

    @Test
    public void hostLecture() {
        Student[] learners = students.getStudents();
        code.hostLecture(instructor, 12);
        Double expected = 3.0;

        for (int i = 0; i < learners.length; i++) {
            Double actual = learners[i].getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }
    }

}