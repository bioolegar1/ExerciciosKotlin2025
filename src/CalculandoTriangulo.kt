/**
 * Calcular a ára do triangulo
 * àrea = (base * altura) / 2
 */


fun main () {
    //ler a base com validação
    val base = lerValorPositivo("Informe a Base do Triângulo (um número inteiro positivo):")

    //ler a altura com validação
    val altura = lerValorPositivo("Informe a Altura do Triângulo (um número inteiro positivo):")


    val areaDoTriangulo = calcularAreaTriangulo ( base, altura )
    println("Area do triangulo:$areaDoTriangulo ")
}
fun calcularAreaTriangulo (base :Int, altura:Int) :Int {
    return (base * altura)/2
}
//Função para validar entrada do usuário
fun lerValorPositivo (mensagem: String):Int {
    var valor: Int? //Variável para armazenar o valor validado
    do {
        println(mensagem) //exibe mensagem ao usuário
        val entrada = readLine() //Le a entrada como String
        valor = entrada?.toIntOrNull() //Converte para Int, ou retorna se for invalidado
        if (valor == null || valor <= 0) {
            println("Por favor, Informe um número inteiro positivo.")
        }
    }while (valor == null || valor <= 0) //Continua quando o valor for invalido
        return valor
    }
