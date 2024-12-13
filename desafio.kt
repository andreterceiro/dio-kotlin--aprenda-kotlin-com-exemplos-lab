enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(val nome: String, val duracaoHoras: Int, val nivel: Nivel)

data class Aluno(val codigo: Int, var nome: String)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }
}

fun main() {
    val conteudosEducacionais1 = ArrayList<ConteudoEducacional>()
    conteudosEducacionais1.add(ConteudoEducacional("Introdução a Kotlin", 3, Nivel.BASICO))
    conteudosEducacionais1.add(ConteudoEducacional("A interface List", 2, Nivel.INTERMEDIARIO))
    conteudosEducacionais1.add(ConteudoEducacional("Falando sobre ArrayList", 2, Nivel.INTERMEDIARIO))

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
    conteudosEducacionais2.add(ConteudoEducacional("A importância do 'mis en place", 2, Nivel.BASICO))
    conteudosEducacionais2.add(ConteudoEducacional("Carnes vermelhas", 8, Nivel.INTERMEDIARIO))
    conteudosEducacionais2.add(ConteudoEducacional("Carnes brancas", 6, Nivel.INTERMEDIARIO))
    conteudosEducacionais2.add(ConteudoEducacional("Refeições vegetarianas", 6, Nivel.AVANCADO))    

    val aluno4 = Aluno(4, "André")    
    
    // Agora vamos inscrever o aluno4 na útima formação que criei
    val formacao = Formacao("Técnicas de gastronomia", conteudosEducacionais2)
    formacao.matricular(aluno4)

    



}
