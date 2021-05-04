package example

class Child: Parent {
    var childAge: Int = 0
    var childName: String = ""

    constructor(childAge: Int, childName: String){
        super.call()
        this.childAge = childAge
        this.childName = childName
    }

    constructor(age: Int, name: String, childAge: Int, childName: String)
        :super(age, name){
            this.childAge = childAge
            this.childName = childName
    }
}