fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0;

    for (i in numeroRomano!!.indices) {
        // Recupera o valor em romano do indice atual.
        val atual = numerosRomanos.getValue(numeroRomano[i])
        // Recupera o valor em romano do próximo indice (caso exista).
        val proximo = when (i + 1) {
            // Caso o próximo indice não exista, atribui 0 à variável $proximo.
            numeroRomano.length -> 0
            // Caso contrário, atribui o valor em romano equivalente ao próximo indice.
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        if (i > 0 && numerosRomanos.getValue(numeroRomano[i - 1]) < atual) {
            continue
        } else if (atual >= proximo) {
            resultado += atual
        } else {
            resultado += proximo - atual
            continue
        }
    }

    print(resultado)
}