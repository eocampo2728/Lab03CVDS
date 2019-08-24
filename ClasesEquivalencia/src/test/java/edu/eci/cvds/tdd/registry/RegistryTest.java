package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void isDead() {

        Person person = new Person("Paulo",1,43,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void isUnderage() {

        Person person = new Person("Adriana",2,14,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void isInvalidAge() {

        Person person = new Person("Fabian",3,-12,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void isValid() {

        Person person = new Person("Marian",4,23,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void isDuplicated() {

        Person person = new Person("Mario",5,43,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    
    @Test
    public void isInvalidName() {

        Person person = new Person("yeimi",5,28,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_NAME, result);
    }
}