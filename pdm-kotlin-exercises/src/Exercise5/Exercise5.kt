package Exercise5

//Manipulating high-order-functions

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun soma(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
// Main
fun main() {
    // 1. Chamadas do primeiro passo

    println("Square root:" + processaInteiro(1, ::raizQuadrada))
    println("Sum: " + processaInteiros(3, 4, ::soma))
    println("Multiply: " + processaInteiros(2, 5, ::multiplica))


    // 2. Chamadas do segundo passo

    val result1 = processaInteiro(4) {numero ->
        for (n in 1..numero) {
            if (n * n == numero)
                return@processaInteiro n
        }
        -1
    }
    println("Square root: $result1")

    val result2 = processaInteiros(2, 4) { a, b -> a + b }
    println("Sum: $result2")

    val result3 = processaInteiros(10, 2) {a, b -> a * b}
    println("Multiply: $result3")
}