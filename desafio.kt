enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class ConteudoEducacional(
    val nome: String, 
    val conteudo: String,
    val duracaoHoras: Int,
    val nivel: Nivel
)

data class Aluno(val codigo: Int, var nome: String)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }
}

fun main() {
    val conteudosEducacionais1 = ArrayList<ConteudoEducacional>()
    conteudosEducacionais1.add(ConteudoEducacional("Introdução a Kotlin", "conteúdo 1.1", 3, Nivel.BASICO))
    conteudosEducacionais1.add(ConteudoEducacional("A interface List", "conteúdo 1.2", 2, Nivel.INTERMEDIARIO))
    conteudosEducacionais1.add(ConteudoEducacional("Falando sobre ArrayList", "conteúdo 1.3", 2, Nivel.INTERMEDIARIO))

    val aluno1 = Aluno(1, "Enzo")
    val aluno2 = Aluno(2, "Júlio")
    val aluno3 = Aluno(3, "Tatiana")

    val formacao1 = Formacao("Bootcamp de Kotlin", conteudosEducacionais1)
    
    // Agora vamos inscrever 3 alunos na formação de Kotlin destes
    formacao1.matricular(aluno1)
    formacao1.matricular(aluno2)
    formacao1.matricular(aluno3)

    // Vamos criar agora uma outra formação educacional, com seus conteúdos
    // e inscrever o aluno4
    val conteudosEducacionais2 = ArrayList<ConteudoEducacional>()
    conteudosEducacionais2.add(ConteudoEducacional("A importância do 'mis en place", "conteúdo 2.1", 2, Nivel.BASICO))
    conteudosEducacionais2.add(ConteudoEducacional("Carnes vermelhas", "conteúdo 2.2", 8, Nivel.INTERMEDIARIO))
    conteudosEducacionais2.add(ConteudoEducacional("Carnes brancas", "conteúdo 2.3", 6, Nivel.INTERMEDIARIO))
    conteudosEducacionais2.add(ConteudoEducacional("Refeições vegetarianas", "conteúdo 2.4", 6, Nivel.AVANCADO))

    val aluno4 = Aluno(4, "André")    
    
    // Agora vamos inscrever o aluno4 na útima formação que criei
    val formacao = Formacao("Técnicas de gastronomia", conteudosEducacionais2)
    formacao.matricular(aluno4)
}
