package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    static final Students INSTANCE = new Students();

    private Students(){
    this.add(new Student(1L,"Bailey"));
    this.add(new Student(2L,"Mocha"));
    this.add(new Student(3L,"Jelly"));
    this.add(new Student(4L,"Butters"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] getArray(){
        Student[] person = new Student[personList.size()];
        person = personList.toArray(person);
        return person ;
    }
}
