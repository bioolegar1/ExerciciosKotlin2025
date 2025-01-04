/**
 * Conversor de Medidas
 *
 * 1 pé = 12 polegadas
 *
 * 1 jarda = 3 pés
 *
 * 1 milha = 1.760 jardas
 *
 * Converter pés em polegadas = pés * 12
 * Converter pés em jardas = pés / 3
 * Converter pés em Milhas = Jardas / 1760
 *
 *
 * Outras possibilidades:
 *
 *  - Distâncias, peso, velocidade.
 *
 */


fun main () {
    println("****CONVERSOR DE MEDIDAS****\n")
    println("Informe a Quantidade de pés: ")

    var pes:Int = readLine()!!.toInt()

    var polegadas = converterPesEmPolegadas(pes)
    println("$pes pés, valem $polegadas, polegadas.")

    var jardas = converterPesEmJardas(pes)
    println("$pes pés, valem $jardas, Jardas.")

    var milhas = converterMilhasEmJardas(jardas)
    println("$pes pés, valem $milhas, Milhas.")


}

fun converterPesEmPolegadas (pes:Int):Int {
    return pes*12
}

fun converterPesEmJardas (pes:Int):Double {
    return pes / 3.0
}

fun converterMilhasEmJardas(jardas:Double):Double {
    return jardas / 1760
}