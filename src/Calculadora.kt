import java.math.BigDecimal
import java.math.RoundingMode


class Calculadora {

    private var resultado: BigDecimal = BigDecimal.ZERO


    fun soma  (a: BigDecimal){
        resultado  += a
        mostrarResultado()
    }

    fun subtracao(a: BigDecimal){
        resultado -= a
        mostrarResultado()
    }

    fun multiplicacao(a: BigDecimal){
        resultado *= a
        mostrarResultado()
    }

    fun divisao(a: BigDecimal){
        resultado = resultado.divide(a, 8, RoundingMode.HALF_UP)
        mostrarResultado()
    }

    private fun mostrarResultado() {
        println("O resultadoé: $resultado")
    }

}