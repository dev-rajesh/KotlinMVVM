package com.rajeshkantipudi.kotlinmvvm.samplecode

/**
 * Created by rajeshkantipudi on 02/03/18.
 */

//you should know why we are using setters and getters.
//We are using it to hide variables of the class and to allow access only through methods
//so we can hide details of the class from the clients of the class and
//forbid same clients to change our class directly.
class Square {
    var a = 1
        set(value) {
            field = Math.abs(value)
            //field ? What is this now?
            //This means that you are calling the set method inside
            //the set method cause there is no direct access to the property in Kotlin world.
            //This will make infinite recursion. When you call a = something it automatically calls set method
        }
}