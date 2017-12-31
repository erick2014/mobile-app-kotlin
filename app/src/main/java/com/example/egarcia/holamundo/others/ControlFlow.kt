package com.example.egarcia.holamundo.others

import android.util.Log

/**
 * Created by egarcia on 12/30/17.
 */
class ControlFlow {

    private fun showCase1(){
        val num1 = 5
        val num2 = 10

        if(num1>num2){
            Log.w("CONTROL-FLOW-1 ","$num1 greater than $num2")
        }else{
            Log.w("CONTROL-FLOW-1","$num2 greater than $num1")
        }
    }

    private fun showCase2(){
        val num1 = 5
        val num2 = 10
        //Ass Expresion
        if(num1>num2) Log.w("CONTROL-FLOW-2", "$num1 is greater than $num2")
        else Log.w("CONTROL-FLOW-2","$num2 is greater than $num1")
    }

    private fun showCase3(){
        val x = 1
        //swtich like
        when (x){
            1 -> Log.w("CONTROL-FLOW-3","X==1") //Case 1
            2 -> Log.w("CONTROL-FLOW-3","X==2") //Case 1
            else -> Log.w("CONTROL-FLOW-3","X is other number") //default case
        }

        when (x){
            0,1 -> Log.w("CONTROL-FLOW-3","X==0 o X==1") //Case 0 and 1
        }

        //without arguments(x)
        when {
            ( x%2 == 0 ) -> Log.w("CONTROL-FLOW-3","X is even")
            ( x%2 == 1 ) -> Log.w("CONTROL-FLOW-3","X is odd")
        }

        //without arguments and returning a value
        val isEven = when {
            (x % 2  == 0 ) ->true
            else -> false

        }
    }

    private fun showCase4(){
        //loop for
        val numbers = arrayOf(1,2,3,4,5)

        for(number in numbers) Log.w("CONTROL-FLOW-4", number.toString())

        //Especify the type
        for(number:Int in numbers){
            Log.w("CONTROL-FLOW-4", number.toString())
        }

        //with index
        for( (index,number) in numbers.withIndex() ) Log.w("CONTROL-FLOW-4", "$index: ${number.toString()}")
    }

    private fun showCase5(){
        //while and do while
        var x = 10

        while(x>10){
            Log.w("CONTROL-FLOW-5", x--.toString())
        }

        do{
            Log.w("CONTROL-FLOW-5", x--.toString())
        }while ( x > 0 )
    }

    fun showCases(){
        showCase1()
        showCase2()
        showCase3()
        showCase4()

    }
}