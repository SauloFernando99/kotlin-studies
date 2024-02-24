//Creating functions

fun foo(i: Int, j: Int, soma: (Int, Int) -> Int): Int{
    return soma(i, j)
}

fun bar(i: String, j: String, cat: (String, String) -> String): String{
   return cat(i, j)
}

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"
fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}
