// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val name: String, val age: Int) {}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) = if (inscritos.contains(usuario)) {
        println("${usuario.name} já estava incristo!")
    } else {
        inscritos.add(usuario)
        println("${usuario.name} inscrito com sucesso!")
    }
}

fun main() {
    val douglas = Usuario("Douglas", 22)
    val frontend = ConteudoEducacional("Curso de frontend")
    val backend = ConteudoEducacional("Curso de backend")
    val conteudos = listOf(frontend, backend)

    val formacao = Formacao("Desenvolvimento Fullstack", conteudos, Nivel.INTERMEDIARIO)

    formacao.matricular(douglas)
}
