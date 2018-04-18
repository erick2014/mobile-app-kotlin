package com.example.egarcia.holamundo.others

import android.util.Log

/**
 * Created by egarcia on 1/1/18.
 */

//DOC: https://kotlinlang.org/docs/reference/classes.html
//DOC: https://kotlinlang.org/docs/reference/properties.html
//DOC: https://kotlinlang.org/docs/reference/data-classes.html
//DOC: https://kotlinlang.org/docs/reference/enum-classes.html
//DOC: https://kotlinlang.org/docs/reference/object-declarations.html

//classes are public and final by default
//if we want to inherit from the class, we have to use open( open class MyClass )

class ClassesDemo {

    private fun showCase1(){
        //A class can have one primary constructor and one or more secundary constructors
        //Primary constructor is in the signature of the class declaration
        //Secundary constructor is inside of the class declaration

        //PRIMARY CONSTRUCTOR
        class Person1 //example 1
        class Person2 constructor(var firstName: String) //Primary constructor
        class Person3 (var firstName:String) // the word "constructor can be omitted
        class Person4(val firstName: String , val lastName: String, var age: Int) {
            //this method is called, once the object has been created
            init {
                age = 10
            }
        }
        //example passing values by default in the constructor
        class Person5(val firstName: String="Erick" , val lastName: String = "Garcia", var age: Int=27)

        //to create an object instance , we dont use "new" keyworkd
        val p1 = Person1()
        val p2 = Person2("Erick")
        val p3 = Person3("Erick")
        val p4 = Person4("Erick","Garcia",5)
        val p5 = Person5("Roberto","Perez",10)
        val p5_1 = Person5()
        val p5_2 = Person5("Roberto")
        val p5_3 = Person5( age = 50 ) // we can pass the params in different order

    }

    private fun showCase2(){
        //Secondary constructors ( are lesss used in kotlin)
        open class Person {
            constructor(firstName: String, lastName: String){
                Log.w("CLASSES-2","Welcome $firstName $lastName!")
            }
        }

        //inherit from class Person and call the constructor using the parent constructor
        class Child : Person {
            constructor():super("ohh lala","hahaha")
            constructor(firstName:String, lastName: String) : super(firstName,lastName)
        }

        val p1= Child() // here we call the first constructor
        val p2= Child("Erick","Garcia") // here we call the second constructor
        //we dont have access to person.firstName or person.lastName

    }

    private fun showCase3(){
        //difference between INIT and Secondary Constructor
        class Person1{
            //Init gets called after the primary constructor and before the secondary constructor
            init {
                Log.w("CLASSES-3","Welcome FROM INIT") //We don't have access to firstName or lastName
            }
            constructor(firstName:String, lastName:String){
                Log.w("CLASSES-3","Welcome from secondary CONSTRUCTOR!")
            }
        }

        //class definition and primary constructor
        class Person2(firstName:String, lastName:String){
            //init method
            init{
                //Here we can access to the properties
                Log.w("CLASSES-3","Hello $firstName $lastName")
            }
            //secondary constructor
            constructor():this("Erick ","Garcia"){

            }
        }

        // here we are calling the secondary constructor which has two parameters
        //so we have to pass them when initiating
        val p1 = Person1("erick","garcia")

        // we can create an instance without passing any parameter
        // because the secondary constructor( constructor():this() ) is empty
        val p2 = Person2()
        // here we are passing two parameters, then we are calling the first constructor( init{} )
        val p3 = Person2("Julito","Rodriguez")

    }

    private fun showCase4(){
        //val, var or nothing in the constructor

        // can't access to firstName when instantiating the class
        // because we are not using var or val
        class Person1(firstName:String)
        class Person2(var firstName: String) // can access to firstName prop, when instantiating, and we can change firstName value
        class Person3(val firstName:String) // can access to firstName prop, when instantiating, but can't change firstName value

        var p1 = Person1("erick")

        // create an instance with an initial value
        var p2 = Person2("juanito")
        //modify the firstName's value
        p2.firstName = "new name for juanito"
        // we should see the text "new name for juanito"
        Log.w("Show case 4 ", p2.firstName)

        var p3 = Person3("ana")
        //p3.firstName = "uff" here we get an error


    }

    private fun showCase5(){
        //Properties  - GETTERS AND SETTERS
        class Person1(var firstName:String)
        val p1 = Person1(firstName = "Erick")
        p1.firstName // this is the same as getFirstName()
        p1.firstName="Antonio" // this is the same as setFirstName("Antonio")

        class Person2{
            //field - represents the property, never use this.property
            var firstName : String
                get() = field.capitalize()
                set(value) {
                    field = value.capitalize()
                }

            constructor(firstName:String){
                this.firstName=firstName;
            }
        }

        val p2 = Person2("erick")
        Log.w("CLASSES-4 ","Say hey to ${p2.firstName}")

    }

    private fun showCase6(){
        //inheritance and interfaces
        open class Person1(var name:String)
        open class Person2(open var name:String)
        open class Person3(open var name:String)
        //if we inherit from Person1, the name of the properties can't be named in the same way, between father and child
        //class Person11(var name:String):Person1(name)

        //We can have both classes with the same properties, but we need to add open an override
        class Person22(override var name:String):Person2(name)

        class Person33(override  var name: String, override var age:Int):Person3(name), IPerson{
            override fun hello() {}

        }

    }

    fun showCases(){
        showCase4()
    }

    //define an interface
    interface IPerson{
        var age: Int
        fun hello()
    }
}