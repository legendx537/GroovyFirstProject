package com.legend.groovy

class Patient {
    def firstName,lastName,age
    // we can have static variable
    static hospitalCode="Best Hospital"

    // Groovy also by default provide all setters and getters
    // Here we are overRidding One of the setter methods
    void setLastName(lastName) {
        if(lastName==null) {
            throw new IllegalArgumentException("Last name can not be null")
        }
        this.lastName = lastName
    }
    static void display() {
        println hospitalCode
    }

    static void main(String[] args) {
        def p=new Patient()
        println p.firstName+" "+p.lastName+" "+p.age

        p.setFirstName("legend")
        p.setLastName("isReady")
        p.setAge(20)
        println p.firstName+" "+p.lastName+" "+p.age

        display()
    }

}




