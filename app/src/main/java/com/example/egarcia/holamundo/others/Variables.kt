package com.example.egarcia.holamundo.others

import android.util.Log
import javax.xml.transform.dom.DOMLocator


/**
 * Created by egarcia on 12/15/17.
 */

/*
In Kotlin everything is an object.
there are not basic types, and void doesn't exists
If something doesn't return nothing, then it is returning an Unit Object
Variables can be mutables or inmutables, we are going to use immutable every time we can( var vs val)
Types are defined after variable's name with colon and space( var name: type)
*/
class Variables {

    private var variable0= 1
    private var variable1= 1.toByte()
    private var variable2 = -123
    private var variable3 = 2147483684
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.9
    private var variable6 = 'a'
    private var variable7 = "alalal"
    private var variable8 = true
    private var variable9 = arrayOf(1,2,3,4,5)
    private var variable10 = arrayOfNulls<Int>(10)//Only accepts int if you want to change the value
    private val variable11 = "This variable in read-only-immutable"



    private fun showCase(){
        Log.w("Variable-0","¿Is variable0 an Integer? -->"+(variable0 is Int))
        Log.w("Variable-1","¿Is variable1 u Byte? -->"+(variable1 is Byte))

    }
    //show case for int
    private fun showCase2(){
        Log.w("VARIABLE-2","Es un valor Integer")
        variable2=Int.MAX_VALUE
    }

    //show case for long
    private fun showCase3(){
        Log.w("VARIABLE-3","¿Is Long?-->"+(variable3 is Long))
        variable3= Long.MAX_VALUE
    }

    //show case for float
    private fun showCase4(){
        Log.w("VARIABLE-4","¿Is a Float? -->"+(variable4 is Float))
    }

    //show case for Double
    private fun showCase5(){
        Log.w("VARIABLE-5","¿Is a Double?? -->"+(variable5 is Double))
    }

    //show case for Char
    private fun showCase6(){
        Log.w("VARIABLE-6","¿Is a Char?? -->"+(variable6 is Char))
    }

    //show case for String
    private fun showCase7(){
        Log.w("VARIABLE-7","¿Is a string?? -->"+(variable7 is String))
        // String Literals
        variable7="¡Hello world! \n ¡Bye world!" //java style
        variable7= """
                        !Hola Mundo!
                        ¡Adios Mundo!
                    """//kotlin's style

        //string Templates
        var points = 9
        var maxPoints = 10

        variable7 = "Hello, I have "+points+" over "+maxPoints//Java Style
        variable7 = "Hi, I have $points points over $maxPoints"//Kotlin's style
        variable7 = "Hi, I have ${points*10} points over ${maxPoints*10}"//Kotlin's style
    }

    //show case for Boolean
    private fun showCase8(){
        Log.w("VARIABLE-8","¿Is Boolean?? -->"+(variable8 is Boolean))
    }

    //show case for array<Int>
    private fun showCase9(){
        Log.w("VARIABLE-9","¿Is an array of integers?? -->"+(variable9 is Array<Int>))
    }

    //show case for array<Int?> --> array of nulls
    private fun showCase10(){
        Log.w("VARIABLE-10","¿Is an Array<Int>? -->"+(variable10 is Array<Int?>))
        //can be resized
        variable10= arrayOfNulls(3)
        //can be changed to an array of int
        variable10 = arrayOf(1,2,3,4,5)
    }
}