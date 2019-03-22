package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        String expectedName = "Leon";
        Long expectedId = 10L;

        //when
        Person person = new Person(expectedId, expectedName);
        //then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }
}
