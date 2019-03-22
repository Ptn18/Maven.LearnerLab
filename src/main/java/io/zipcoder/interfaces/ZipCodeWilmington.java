package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    Students students;
    Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington(Students students){
        this.students= students;
    }

    public void hostLecture(Educator teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }
    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        teacher.lecture(students.getArray(), numberOfHours);
    }
}
