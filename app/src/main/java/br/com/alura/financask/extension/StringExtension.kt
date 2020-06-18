package br.com.alura.financask.extension


fun String.limitaEmAte(caracteres: Int): String {
    return if (this.length > caracteres) {
        "${this.substring(0, caracteres)}..."
    } else {
        this
    }
}