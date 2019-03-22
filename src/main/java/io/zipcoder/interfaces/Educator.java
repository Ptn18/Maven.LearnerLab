package io.zipcoder.interfaces;

public enum Educator implements Teacher{
   NHU,
   LEON,
   FROILAN,
   WILHEM,
   DOILO
    ;
   private double timeWorked;

   private final Instructor instructor;

  Educator(){
       instructor = new Instructor(this.name().hashCode(), this.name());
       Instructors.getInstance().add(instructor);
   }


    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
        timeWorked += numberOfHours;

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;
    }
    public Double gettimeWorked(){
      return timeWorked;
    }

    public void clearTimeWorked() {
        this.timeWorked = 0;
    }
}
