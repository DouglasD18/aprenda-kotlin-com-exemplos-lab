fun main() {
    val entrada: String? = readLine()

    // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
    // Referência: https://kotlinlang.org/docs/destructuring-declarations.html
    val (dia, mes, ano) = entrada!!.split("/")

    fun returnMes(mes: Int): String {
        val valor: String
        when(mes) {
            1 -> valor = "Janeiro"
            2 -> valor = "Fevereiro"
            3 -> valor = "Março"
            4 -> valor = "Abril"
            5-> valor = "Maio"
            6 -> valor = "Junho"
            7 -> valor = "Julho"
            8 -> valor = "Agosto"
            9 -> valor = "Setembro"
            10 -> valor = "Outubro"
            11 -> valor = "Novembro"
            12 -> valor = "Dezembro"
            else -> {
                valor = "Error"
            }
        }

        return valor
    }

    val mesPorExtenso = when (mes.toInt()) {
        in 1..12 -> returnMes(mes.toInt())
        else -> "Mês Inválido!"
    }

    println("Imprimir a saída: $dia de $mesPorExtenso de $ano")
}