package example

enum class Code(var codeId: Int, var codeName: String) {
    CODE_A(1, "코드1"),
    CODE_B(2, "코드2"),
    CODE_C(3, "코드3");

    companion object {
        fun getId(c: Code):Int{
            return c.codeId
        }

        fun getName(c: Code):String{
            return c.codeName
        }
    }
}