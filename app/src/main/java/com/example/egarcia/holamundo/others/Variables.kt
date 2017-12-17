package com.example.egarcia.holamundo.others

import android.util.Log
import javax.xml.transform.dom.DOMLocator


/**
 * Created by egarcia on 12/15/17.
 */

/*
En Kotlin todo es un objeto.
No hay tipos basico, y no existe void.
Si algo no devuelve nada, esta devolviendo Unit object.
Las variables pueden ser mutables o inmutables, usaremos imutables siempre que sea posible.( var vs val)
Los tipos son definidos despues del nombre de la variable, con dos puntos y espacio(var nombre: tipo )
*/
class Variables {

    private var variable0= 1;
    private var variable1= 1.toByte();
    private var variable2 = -123;
    private var variable3 = 2147483684;
    private var variable4 = 1.1.toFloat();
    private var variable5 = 1.9;

    private fun showCase(){
        Log.w("Variable-0","¿Es variable0 un Integer? -->"+(variable0 is Int)+"¿Por que no un byte?")
        Log.w("Variable-1","¿Es variable1 un Byte? -->"+(variable1 is Byte)+"¿Por que no un byte?")
    }
    //show case for int
    private fun showCase2(){
        Log.w("VARIABLE-2","Es un valor Integer")
        variable2=Int.MAX_VALUE
    }

    //show case for long
    private fun showCase3(){
        Log.w("VARIABLE-3","¿Es un valor Long?-->"+(variable3 is Long))
        variable3= Long.MAX_VALUE
    }

    //show case for float
    private fun showCase4(){
        Log.w("VARIABLE-4","¿Es un valor Float? -->"+(variable4 is Float))
    }

    //show case for Double
    private fun showCase5(){
        Log.w("VARIABLE-5","¿Es un valor Double? -->"+(variable5 is Double))
    }
}