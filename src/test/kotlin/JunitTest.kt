import example.*
import org.junit.jupiter.api.Test

class JunitTest {
    @Test
    fun testGrammar(){
        var grammar: Grammar = Grammar();

        grammar.printExampleMethod("callMethod!")
        println(grammar.sum())
        println(grammar.sumImplication(5, 15))
        println(grammar.nullable())
        println(grammar.conditional(12L))
        grammar.loop()
    }

    @Test
    fun testCollection(){
        val colors = listOf("red", "blue", "green", "black", "white", "yellow")

        KotlinStream.printList(colors)
        KotlinStream.printListFilterLength(colors, 5)
        KotlinStream.printListConcatString(colors)
    }

    @Test
    fun testClass(){
        var parent: Parent = Parent();
        parent.age = 20
        println("age = ${parent.age}, name = ${parent.name}")

        var parent2: Parent = Parent(26, "Kokoo")
        println("age2 = ${parent2.age}, name = ${parent2.name}")

        var child: Child = Child(20, "Kokoo")
        println("age = ${child.childAge}, name = ${child.childName}")

        var child2: Child = Child(20, "parent", 10, "child")

        println("parent age = ${child2.age}, " +
                "parent name = ${child2.name}, " +
                "child age = ${child2.childAge}, " +
                "child name = ${child2.childName}")
    }

    @Test
    fun testInteraction(){
//        KotlinToJava.print()
        JavaToKotlin.add()
        JavaToKotlin.print()
    }

    @Test
    fun testEnumeration(){
        println(Color.RED.getCode())
        println(Color.GREEN.getCode())
        println(Color.BLUE.getCode())

        println(Code.getId(Code.CODE_A))
        println(Code.getName(Code.CODE_A))
        println(Code.getId(Code.CODE_B))
        println(Code.getName(Code.CODE_B))
        println(Code.getId(Code.CODE_C))
        println(Code.getName(Code.CODE_C))

        println(Code.CODE_A.codeId)
        println(Code.CODE_A.codeName)
        println(Code.CODE_B.codeId)
        println(Code.CODE_B.codeName)
        println(Code.CODE_C.codeId)
        println(Code.CODE_C.codeName)

    }
}