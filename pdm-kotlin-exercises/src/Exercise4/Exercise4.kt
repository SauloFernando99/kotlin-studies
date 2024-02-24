package Exercise4

//Generic high-order-function

fun main() {
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}
