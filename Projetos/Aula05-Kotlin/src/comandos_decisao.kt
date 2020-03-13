// Programa Principal
fun main() {

    val numero = 12

    // Exemplo: if .. else
    if (numero % 2 == 0) {
        println("$numero é par")
    } else {
        println("$numero é ímpar")
    }

    // Exemplo: if .. else if
    if (numero > 0) {
        println("$numero é positivo")
    } else if (numero < 0) {
        println("$numero é negativo")
    } else {
        println("$numero é neutro")
    }

    // Exemplo de retorno de valor com if
    val tipo = if (numero % 2 == 0) "par" else "ímpar"
    println("O número $numero é $tipo")

    // Exemplo de uso do operador when (semelhante ao switch..case)
    val a = 100
    val b = 50
    val operador = "*"

    when (operador) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("Operador inválido")
    }

    // Exemplo de combinação de casos com o operador when
    val n = 5
    when (n) {
        1, 2, 3, 4 -> println("$n é menor do que 5")
        6, 7, 8, 9 -> println("$n é maior do que 5")
        5 -> println("$n é 5")
    }

}