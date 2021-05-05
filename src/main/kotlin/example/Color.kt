package example

enum class Color {
    RED{
        override fun getCode(): String {
            return "#FF0000"
        }
    },
    GREEN{
        override fun getCode(): String {
            return "#ABF200"
        }
    },
    BLUE{
        override fun getCode(): String {
            return "#0100FF"
        }
    };

    abstract fun getCode():String
}

