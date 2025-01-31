package org.example.app.encapsulamentoII

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val henrique = People("12312312322","Henrique", LocalDate.of(1989, 7,30 ) )
            henrique.email = "teste@gmail.com"
            henrique.speak("our code worked!\n")
        }
    }
}