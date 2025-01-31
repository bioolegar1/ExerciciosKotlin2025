package org.example.app.encapsulamentoII

import java.time.LocalDate

class People (
    val cpf: String,
    val peopleName: String,
    val dateOfBirth: LocalDate
) {
    val age = LocalDate.now().year - dateOfBirth.year
    var email = ""
        set(value) {
            if(!Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)) {
                throw Exception("Email Invalid")
            }
            field = value
        }
    fun speak(mensage:String, ) {
        println("$peopleName speak: $mensage")
    }
}