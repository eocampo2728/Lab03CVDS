package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

/**
 * Clase registro
 * @author Eduardo Ocampo & Juan Navarro
 */
public class Registry {
    
    //Atributos
    private static ArrayList<Person> persons = new ArrayList<>();
    
    /**
     * Metodo registerVoter es un metodo para registrar un voto.
     * @param p Es la persona la cual quire registrar su voto.
     * @return  Retorna que tipo de voto fue ("Valid","Dead","Underage","Invalid_Age","Invalid_Name","Duplicated").
     */
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
