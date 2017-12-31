package com.example.egarcia.holamundo.others

import java.lang.NullPointerException

/**
 * Created by egarcia on 12/30/17.
 */
class Nullable{

    private fun showCase1(){
        throw NullPointerException();
    }

    private fun showCase2(var1: String?){
        var1.toString(); //returns null in case of var1  equals null
        var1!!.toString()//returns a NPE in case of var1 equals to null
    }
}