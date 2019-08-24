package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    
    private static ArrayList<Person> persons = new ArrayList<>();
    
    public RegisterResult registerVoter(Person p) {
        RegisterResult isValid = RegisterResult.VALID;
        if(!p.isAlive()){
            isValid = RegisterResult.DEAD;
        }else if(p.getAge()<18 && p.getAge()>0){
            isValid = RegisterResult.UNDERAGE;
        }else if(p.getAge()<=0 || p.getAge()>=130){
            isValid = RegisterResult.INVALID_AGE;
        }else if (p.getName() == "sneider" || p.getName()== "yeimi" || p.getName()== "hassam" || p.getName()=="tulio"){
            isValid = RegisterResult.INVALID_NAME;
        }else{
            for(Person person: persons){
                if(p.getId() == person.getId()){
                    isValid = RegisterResult.DUPLICATED;
                }
            }
            if(isValid==RegisterResult.VALID){
                persons.add(p);
            }
        }
        return isValid;
    }
}
