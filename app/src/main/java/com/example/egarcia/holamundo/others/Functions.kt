package com.example.egarcia.holamundo.others

import android.util.Log

/**
 * Created by egarcia on 4/8/18.
 */
class Functions {
    private fun showCase1(){
        // functions, params, and unit
        fun function1(){}
        var result1 = function1()

        fun function2(): Unit{}
        var result2 : Unit = function2()

        // we need to specify the type of each passed argument
        fun function3(param1: String, param2:String):String{
            return "what's up man this a message $param1, $param2"
        }
        // call function3()
        var result3 = function3("string1","string2")
        // print out the return value of function3()
        Log.w("FUNCTIONS-1 ","return from Function3 ${result3}")

        fun function4(param:Int){}
        // an int param is required
        var result4 = function4(2)
        // define function 5
        fun function5(param:Int=5){}
        // can be called without params, because there is a default value
        var result5 = function5()

    }

    private fun showCase2(){
        // functions with functions by params(callback) and call by lambda

        // define printSum, takes 2 params and one callback function
        fun printSum(num1:Int,num2:Int,printer:(result:Int) -> Unit) {
            printer(num1+num2)
        }
        // here we call printSum and log the param received
        printSum(5,5){ result ->
            Log.w("FUNCTIONS-2","lambda expression printing the sum result => ${result}")
        }
        // if the call back only receives one param, we can omit "result->" and use "it"
        // to get the param
        printSum(12,12){
            Log.w("FUNCTIONS-2","lambda expression printing the sum result => ${it}")
        }
        // define a a function with 2 params, one call back which receives 3 params
        fun printSum2(num1:Int, num2:Int, printer:(result:Int, param1:Int, param2:Int)-> Unit ){
            printer(num1+num2, num1, num2)
        }
        // call printSum2 passing 2 params and one callback with 3 params
        printSum2(7,7){result, num1, num2 ->
            Log.w("FUNCTIONS-2","result param received => ${result}")
            Log.w("FUNCTIONS-2","num1 param received => ${num1}")
            Log.w("FUNCTIONS-2","num2 param received => ${num2}")
        }
    }

    fun showCases(){
        showCase1()
        showCase2()
    }
}