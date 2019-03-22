package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(int i =0; i < personList.size();i++){
            if(personList.get(i).getId() == id){
                return personList.get(i);
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){

        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();

    }

    public Person[] getArray(){
        Person[] person = new Person[personList.size()];
        person = personList.toArray(person);
        return person ;
    }

    public void removeAll(){
        personList.clear();
    }

}
