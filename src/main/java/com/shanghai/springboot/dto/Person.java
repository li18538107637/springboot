package com.shanghai.springboot.dto;

import java.io.Serializable;

public class Person implements Serializable {
    public Person(String personId, String personName, String myCollects) {
        this.personId = personId;
        this.personName = personName;
        this.myCollects = myCollects;
    }

    private String personId;
    private String personName;
    private String myCollects;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMyCollects() {
        return myCollects;
    }

    public void setMyCollects(String myCollects) {
        this.myCollects = myCollects;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", myCollects='" + myCollects + '\'' +
                '}';
    }
}
