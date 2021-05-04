package example

//open을 생랼할 경우 final로 생성, 상속이 불가능
open class Parent{
    //getter, setter
    //get(), set()을 쓰지 않아도 내부적으로 getter,setter 사용
    var age: Int = 0
        get(){
            println("getter 호출")
            return field
        }
        set(value){
            println("setter 호출")
            field = value
        }

    var name: String = ""

    //생성자
    constructor(){

    }

    constructor(age: Int, name: String){
        this.age = age;
        this.name = name;
    }

    fun call(){
        println("Parent Call!")
    }
}