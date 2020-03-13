// Modificadores de acesso
// - private: só a classe acessa
// - protected: só a classe acessa e classes filhas
// - public: todo mundo acessa
// - internal: só os elementos do mesmo módulo acessam (default)

/**
 * Representação de um abajur.
 */
class Abajur {
    // ATRIBUTOS
    private var ligado: Boolean = false

    // MÉTODOS
    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }
}

/**
 * Representação de uma classe Aluno
 */
// construtor primario: sintaxe direta
// construtor secundario: usado em cenarios especificos
class Aluno(pNome: String, pIdade:Int) {
    var nome: String = pNome
        get() {
            print("Chamando o get!")
            return field.capitalize()
        }
        set(value) {
            print("Chamando o set!")
            field = value
        }
    var idade: Int = pIdade

    // Bloco executado na inicialização
    init {
        println(nome)
        println(idade)
    }

}

// Se no construtor primario os parametros tiverem var ou val
// eles se tornam atributos
class Professor(var nome:String = "", val idade:Int){

    fun imprime() {
        println(nome)
        println(idade)
    }
}

data class Disciplina(val nome:String, val cargaHoraria:Int)


// Programa principal
fun main() {
    val abajur = Abajur()
    val a1 = Aluno("João", 21)
    a1.nome = "Petterson"

    val d = Disciplina(
        nome = "POO",
        cargaHoraria = 4
    )
    println(d)
}