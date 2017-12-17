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

    private var variable0= 1;
    private var variable1= 1.toByte();
    private var variable2 = -123;
    private var variable3 = 2147483684;
    private var variable4 = 1.1.toFloat();
    private var variable5 = 1.9;

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
        Log.w("VARIABLE-4","¿Is Float? -->"+(variable4 is Float))
    }

    //show case for Double
    private fun showCase5(){
        Log.w("VARIABLE-5","¿Is Double?? -->"+(variable5 is Double))
    }
}