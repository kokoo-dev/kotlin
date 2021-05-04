package example

class JavaToKotlin {
    companion object {
        const val NUM: Int = 10

        fun add(){
            println(KotlinToJava.NUM + NUM)
        }

        fun print(){
            println("test1")
        }
    }
}