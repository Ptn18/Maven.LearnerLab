package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    static final Instructors INSTANCE = new Instructors();

//    private Instructors(){
//     this.add(new Instructor(1L, "Nhu"));
//     this.add(new Instructor(2L, "Leon"));
//     this.add(new Instructor(3L, "Froilan"));
//     this.add(new Instructor(4L, "Wilhem"));
//     this.add(new Instructor(5L, "Dolio"));
//    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] getArray() {
        Instructor[] instruct = new Instructor[personList.size()];
        return personList.toArray(instruct);
    }
}
