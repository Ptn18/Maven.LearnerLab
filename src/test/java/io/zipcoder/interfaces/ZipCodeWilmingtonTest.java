package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    Educator instructor = Educator.NHU;
    Student student = new Student(1L,"Apple");
    Student student1 = new Student(2L,"Pumpkin");
    Student student2 = new Student(3L, "Cheese");
    Students students = Students.getInstance();
    ZipCodeWilmington code = new ZipCodeWilmington(students);

    @Test
    public void hostLecture() {
        students.removeAll();
        students.add(student);
        code.hostLecture(instructor, 12);
        Double expected = 12.0;

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void hostLectureForId() {
        Instructor instructor = Instructors.getInstance().getArray()[0];
        students.removeAll();
        students.add(student);
        code.hostLecture(instructor.getId(), 12);
        Double expected = 12.0;

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}