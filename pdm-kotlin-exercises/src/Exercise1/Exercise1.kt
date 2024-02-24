package Exercise1

//Find Sistemas in string

fun findSistemasString(list: MutableList<String>): MutableList<String> {

    val foundStrings = mutableListOf<String>()

    for (string in list) {
        if ("Sistemas" in string) {
            foundStrings.add(string)
        }
    }

    return foundStrings
}

fun main(){
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas"
    )

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    val foundStrings = findSistemasString(listaCursos)

    var count = 0

    for (string in foundStrings){
        println(count.toString() + " - " + string)
        count++
    }
}