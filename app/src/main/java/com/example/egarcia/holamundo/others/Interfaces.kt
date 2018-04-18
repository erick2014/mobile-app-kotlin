package com.example.egarcia.holamundo.others

import android.util.Log
import java.util.*

/**
 * Created by egarcia on 1/1/18.
 */
class Interfaces {

    private var anonymousObjectImplementingInterface: Any? = null

    private fun showCase1(){
        anonymousObjectImplementingInterface = object : Interface1{
            override fun abstractMethod() {
                //the implementation is optional
            }
        }
        // we need to cast the type because in the variable declaration we set it up as any
        //then it can't infer the right type
        (anonymousObjectImplementingInterface as Interface1).methodWithImplementationByDefault()
        (anonymousObjectImplementingInterface as Interface1).abstractMethod()
    }

    private fun showCase2(){
        val aoii = object : Interface2{
            override val propertyAbstract: Int
                get() = 10
        }

        aoii.propertyAbstract
        aoii.propertyWithImplementation
        aoii.hello()
    }

    fun showCases(){
        showCase1()
        showCase2()
    }
}

interface Interface1{

    fun abstractMethod()
    fun methodWithImplementationByDefault(){

    }

}

interface Interface2{

    val propertyAbstract:Int
    var propertyWithImplementation: String
        get() = "ByDefault"
        set(value) {this.propertyWithImplementation=value;}

    fun hello(){
        Log.w("INTERFACE-2","Is it working by default $propertyWithImplementation? , YAY! $propertyAbstract :)")
    }

}