fun main () {
    var valorA =10
    var valorB = 20
    var i = 23

    if (i == null) {
        executarProcessamento()
    }
    else {
        naoExecutarProcessamento()
    }
    println("\n\n FIM...")
}


fun executarProcessamento(){
    print("Processando...")
}

fun naoExecutarProcessamento(){
    print("Sem Processamento...")
}