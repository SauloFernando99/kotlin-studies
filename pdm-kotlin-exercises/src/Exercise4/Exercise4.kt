package Exercise4

//Generic high-order-function

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String) = "${i}${j}"

fun <I, J, F> xpto(param1: I, param2: J, callback: (I, J) -> F): F {
    return callback(param1, param2)
}

fun main() {
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}
