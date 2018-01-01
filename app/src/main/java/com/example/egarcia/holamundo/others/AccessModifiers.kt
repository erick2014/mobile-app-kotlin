package com.example.egarcia.holamundo.others

import android.util.Log

/**
 * Created by egarcia on 12/31/17.
 */

//to be able to extend or inherit from class(inheritance) we have to set it as open( open class MyClass )
// in java is open by default and in kotlin  is final by default, thus it can't be extended without setting the class as open

open class AccessModifiers {

    //private  --> only visible within the class
    //protected --> only visible within the class and within its sub classes (inheritance)
    //public --> visible within the class and subclasses

    val prop1 = "Public by default"
    private val prop2 = "Marked as private"
    protected val prop3 = "Marked as protected"

    private fun showCase(){
        val test= AccessModifiers()

    }

}


//extends AccessModifiersClass
class AccessModifiersChild : AccessModifiers(){

    private fun showCase(){
        //we have access to prop1 and prop3
        this.prop1
        this.prop3
        //but we don't have access to prop2
    }

}

class AnotherClass{

    private fun showCase(){
        val test = AccessModifiers();
        test.prop1 // is accessible from parent because this prop is public
    }

}