package Exercise2

//Map print

fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    for (familyMember in familiaMap){
        println(familyMember.key + ": " + familyMember.value)
    }

}