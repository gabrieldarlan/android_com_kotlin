package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String {
    val formatadoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatadoBrasileiro)
    return format.format(time)
}