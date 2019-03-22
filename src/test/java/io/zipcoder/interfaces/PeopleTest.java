package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    Person person = new Person(1L,"Bailey");
    People people = new People();

    @Test
    public void addTest() {
    //when
        people.add(person);
        int expectedCount = 1;
        int actual = people.getCount();
        Assert.assertEquals(expectedCount,actual);
    }

    @Test
    public void findByIdTest() {
        people.add(person);
        Assert.assertEquals(person, people.findById(1L));
    }
    @Test
    public void removeTest() {
        people.add(person);
        people.remove(person);
        int expected = 0;
        int actual = people.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeByIdTest() {
        people.add(person);
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();
        Assert.assertEquals(expected,actual);
    }
}