package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*


fun String.limitaEmAte(caracteres: Int): String {
    return if (this.length > caracteres) {
        val primeiroCaracter = 0
        "${this.substring(primeiroCaracter, caracteres)}..."
    } else {
        this
    }
}

fun String.converteParaCalendar(): Calendar {
    val formatoBrasileiro = SimpleDateFormat("dd/MM/yyyy")
    val dataConvertida = formatoBrasileiro.parse(this)
    val data = Calendar.getInstance()
    data.time = dataConvertida
    return data
}