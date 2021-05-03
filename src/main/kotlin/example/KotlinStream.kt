package example

import java.lang.StringBuilder
import java.util.*

/**
 * Stream 예제 클래스
 * Java에서 사용하는 것과 큰 차이는 없음
 * 차이점 ex) Java: forEach(동작), Kotlin: forEach{동작}
 */
class KotlinStream {
    companion object {
        /**
         * 리스트 출력
         */
        fun printList(list: List<Any>) {
            list.stream().forEach { println(it) }
        }

        /**
         * filter
         */
        fun printListFilterLength(list: List<Any>, length: Int){
            list.stream().filter{value -> value.toString().length == length}.forEach{println(it)}
        }

        /**
         * map
         */
        fun printListConcatString(list: List<Any>){
            list.stream().map {value -> concatRandomStr(value.toString())}.forEach{println(it)}
        }

        private fun concatRandomStr(str: String): String?{
            var sb: StringBuilder = StringBuilder(str)
            var uuid: UUID = UUID.randomUUID()

            sb.append(uuid)

            return sb.toString()
        }
    }
}