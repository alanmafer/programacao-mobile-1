// Programa principal
fun main() {

    // Exemplo: while
    var numero = 0
    while (numero < 10) {
        print("$numero, ")
        numero += 1
    }
    println()

    // Exemplo: do..while
    var valor: String
    do {
        println("Digite 'sair' para sair: ")
        valor = readLine()!!
    } while (valor != "sair")

    // Exemplo: for
    // Operador de intervalo ".." gera os valores de 1 até 10 (inclusive)
    for (i in 1..10) {
        print("$i, ")
    }
    println()

    // Se o for tiver somente um comando, pode ser escrito inline
    for (i in 10 downTo 1 step 2) print("$i, ")
    println()

}