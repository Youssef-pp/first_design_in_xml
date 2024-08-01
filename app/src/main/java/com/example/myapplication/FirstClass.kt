package com.example.myapplication

fun main() {
    var e = Employee("youssef","programmer")
    e.bouns = 500.0
    println(e.bouns)
    var r = programmer("Student")
    r.println()
    r.display()


    fun Employee.myFun():String{return "Hello Youssef"}
    println(e.myFun())








    var dataClass = myDataClass(10)
    println(dataClass.id)











    println(myEnum.Basketball)



}
open class Employee(var name: String = "" , var type : String){

    var bouns :Double = 200.0
        set(value) {
            if(name.equals("youssef")){
                field = 1000.0
            }else
                field = value
        }
        get() {return field}
    open fun println(){
        print("I'm emploee")
    }

}
class programmer(type : String) : Employee(type = type ) , person {
    override fun println(){
        println("I'm programmer")
    }

    override fun display() {
        println("hello interface")
    }
}
interface person{
    fun display()
}