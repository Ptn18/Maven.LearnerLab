package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    Students students;
    Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington(Students students){
        this.students= students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getStudents(), numberOfHours);
    }
    public void hostLecture(Long id, double numberOfHours){
        Instructor instruct = (Instructor) instructors.findById(id);
        hostLecture(instruct,numberOfHours);
//        instruct.lecture(students.getStudents(), numberOfHours);
    }
}
