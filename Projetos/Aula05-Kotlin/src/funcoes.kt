// Exemplo de declaração de função
fun imprime1() {
    println("1")
}

// Exemplo de função com somente um comando
fun imprime5() = println("5")

// Se a função retorna um valor, não precisa do comando return
fun get7() = 7

fun get8():Int = 8

// Exemplo de função que recebe parâmetros
// - parâmetros sempre são passados como val (implícito)
fun soma(a: Int, b: Int): Double {
    val soma = a + b
    return soma.toDouble()
}

// Exemplo parâmetros com valores padrão
fun imprimeIntervalo(min: Int = 0, max: Int = 10) {
    for (i in min..max) {
        print("$i, ")
    }
    println()
}


// Exemplo de função infixa
class Quadrado {

    // Condições para uma função ser infixa:
    //    - Ser um métodos de uma classe
    //    - Possuir apenas um parâmetro
    //    - Ser marcada com a palavra-chave `infix`
    infix fun desenha(lado: Int) {
        for (i in 1..lado) {
            for (j in 1..lado) print("* ")
            println()
        }
    }
}

fun main() {
    imprime1()
    imprime5()

    val x = get7()
    val y = get8()
    println("$x, $y")

    imprimeIntervalo(7, 15)
    imprimeIntervalo(7)
    imprimeIntervalo()

    imprimeIntervalo(min = 10, max = 20)

    val quad = Quadrado()
    quad desenha 5

}


