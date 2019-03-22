package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person>{
    ArrayList<E> personList = new ArrayList<E>();


    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
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

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }

}
