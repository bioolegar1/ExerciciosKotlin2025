import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.soma(BigDecimal.ONE)
            calculadora.divisao(BigDecimal("50"))
        }
    }
}