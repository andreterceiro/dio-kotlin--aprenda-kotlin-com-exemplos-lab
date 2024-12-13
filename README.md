# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

# Resolução

Farei inicialmente alguns diagramas com o Mermaid:

```mermaid
---
title: Classes do sistema
---
classDiagram
    class ConteudoEducacional {
        - Integer codigo
        - String nome
        - String conteudo
        + Integer getCodigo()
        + Double getNome()
        + String getFormacoes()
        + String getConteudo()
        + void setCodigo(Integer code)
        + void setNome(String nome)
        + void setConteudo(String conteudo)
    }

    class Formacao {
        - Integer codigo
        - String nome
        - Nivel nivel
        + Integer getCodigo()
        + Double getNome()
        + Nivel getNivel()
        + ConteudoEducacional getConteudoEducacional()
        + void setCodigo(Integer code)
        + void setNome(String nome)
        + void setNivel(Nivel nivel)
        + void setConteudoEducacional(ConteudoEducacional conteudoEducacional)
    }

    class Aluno {
        - Integer codigo
        - String nome
        - List<Formacao> formacoes
        + Integer getCodigo()
        + Double getNome()
        + void setCodigo(Integer code)
        + void setNome(String nome)
        + void matricular(Formacao formacao)
    }
 
    class Nivel{
        <<enumeration>>
        BASICO
        INTERMEDIARIO
        AVANCADO
    }

    ConteudoEducacional "1" *-- "N" Formacao
    Formacao "N" -- "N" Aluno
    ConteudoEducacional "1" -- "1" Nivel
```

**OBS:** eu **ão** me preocuparei com algumas propriedades que na prática seriam importantes em um sistema real. Por exemplo um aluno (renomeei "usuario" para "aluno") não terá endereço, CEP, CPF etc. Eu me preocuparei com a relação entre os objetos, ok?

A idéia geral é: usarei ao menos em parte a nomenclatura que a DIO usa. Eu estou em uma formação de Kotlin, que tem vários cursos, desafios, lives etc. Trocarei o nome da classe "Usuario" para "Aluno". Então um aluno se matriculará em uma formação (ex: Kotlin) e esta terá vários conteúdos educacionais. Cursos, desafios, lives? Não, simplificarei. O conteúdo educacional terá uma propriedade "conteudo" (e seus getter e setter) simplesmente. Como você pode ver na plataforma, o que estou chamando de "ConteudoEducacional" terá um nível. O aluno matriculará-se em uma formação, um conjunto de conteúdos educacionais. Simples assim... Vendo o diagrama acima talvez fique mais clario.