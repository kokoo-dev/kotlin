import example.KotlinStream
import example.Grammar
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
}