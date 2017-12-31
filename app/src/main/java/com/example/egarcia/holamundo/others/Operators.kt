package com.example.egarcia.holamundo.others

import android.util.Log

/**
 * Created by egarcia on 12/30/17.
 */
class Operators {

    private fun showCase1(){
        var a = 5
        var b = 5
        Log.w("OPERATORS-1","Referential equality. Es 'a' igual a 'b' ? ${a===b}")
        Log.w("OPERATORS-1", "Structural equality. Es 'a' igual a 'b' ${a==b} ")
    }

    private fun showCase2(){
        val pn1 = PersonNormal()
        val pn2 = PersonNormal()
        Log.w("OPERATORS-2","Referential equality: 'pn1' equals to 'pn2' ? ${pn1===pn2}") //false
        Log.w("OPERATORS-2", "Structural equality: 'pn1' equals to 'pn2' ${pn1==pn2} ") //false, beacause doesn't override equal
    }

    private fun showCase3(){
        var pn1 = PersonEqualOverride("juanito")
        var pn2 = PersonEqualOverride("juanito")
        Log.w("OPERATORS-3","Referential equality 'pn1' equals to 'pn2' ? ${pn1===pn2}") //false
        Log.w("OPERATORS-3", "Structural equality: 'pn1' equals to 'pn2' ${pn1==pn2} ") //true
    }

    private fun showCase4(){
        var pn1 = PersonDataClass()//Erick 29
        var pn2 = PersonDataClass()//Erick 29
        var pn3 = PersonDataClass("juanito") //juanito 29

        Log.w("OPERATORS-4","Referential equality 'pn1' equals to 'pn2' ? ${pn1===pn2}") //false
        Log.w("OPERATORS-4", "Structural equality: 'pn1' equals to 'pn2' ${pn1==pn2} ") //true
        Log.w("OPERATORS-4", "Structural equality: 'pn1' equals to 'pn3' ${pn2==pn3} ") //false

    }


    fun showCases(){
        showCase1()
        showCase2()
        showCase3()
        showCase4()
    }

    class PersonNormal{
        val name="alejandro"
    }

    class PersonEqualOverride(name:String) {
        val name = name
        override fun equals(other: Any?): Boolean {
            if(other===null) return false
            if(other is PersonEqualOverride){
                return other.name === this.name
            }
            return false
        }
    }

    data class PersonDataClass(val name:String = "Erick", val age: Int = 29)
}