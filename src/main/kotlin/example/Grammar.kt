package example

/**
 * 기본문법 예제 클래스
 */
class Grammar {

    // val = 상수, var = 변수
    val constant: Int = 10
    var variable: Int = 20

    //타입 추론
    var p1 = 1
    var p2 = "String"
    var p3 = true
    var p4 = 4L
    var p5 = 1.1
    var p6 = intArrayOf(1,2,3,4)

    /**
     * 파라미터 받아서 출력
     */
    fun printExampleMethod(s: String){
        println(s)
    }

    /**
     * 리턴 타입 지정
     */
    fun sum(): Int{
        //상수
//        constant = 20;

        variable = 30;

        return constant + variable;
    }

    /**
     * 함축된 함수 내용
     */
    fun sumImplication(a:Int, b:Int): Int = a+b

    /**
     * nullable type 지정
     */
    fun nullable(): Int? {
        //타입뒤에 물음표 추가시 null 가능
        var num1: Int = 10
        var num2: Int? = 10

        //오류
        //num1 = null

        num2 = null

        return num2
    }

    /**
     * Any = Object, 객체 타입 확인
     */
    fun conditional(obj: Any): String{
        var flag = false

        //if
        //is는 자바에서 instanceof
        if(obj is String)
            flag = true

        println(flag)

        return when(obj){
            is Int -> "Int"
            is Double -> "Double"
            is Long -> "Long"
            is String -> "String"
            is Boolean -> "Boolean"
            else -> "Other Object"
        }
    }

    /**
     * 반복문 실행
     */
    fun loop(){
        val list= ArrayList<Int>()
        list.add(5)
        list.add(4)
        list.add(3)
        list.add(2)
        list.add(1)

        //for
        for (i in 0 until list.size){
            println(list[i])
        }

        //for each
        for(num in list){
            println(num)
        }

        //while
        while (list.isNotEmpty()){
            println(list.removeAt(0))
        }

    }

}