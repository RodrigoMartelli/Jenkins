import Jenkins.*
import groovy.util.*
import groovy.time.TimeCategory


def pessoa = new Pessoa(nome:"Henrique")
def animal = new Cachorro(nome:"Cão")
animal.closure = pessoa.apresenteSe
def tempoLimite = new Date()
println(pessoa.apresenteSe)
animal.fale() //imprimirá "Ola. Meu nome e Henrique"
pessoa.nome = "Angelica"
animal.fale() //imprimirá "Ola. Meu nome e Angelica"
sleep 100
println('teste')

use( TimeCategory ) {
    tempoLimite = tempoLimite + 1.minutes
}

timeLimit = System.currentTimeMillis() + 10000
println(timeLimit)
contador = 0

String teste1 = 'sc query ${env.GATEWAY} | find "RUNNING"'
println(teste1)

Runtime.getRuntime.exec("dir");


// while (contador < 100){
//        sleep 6000
//        contador = contador + 1
//        println(contador)

//     }


//System.gc

println(teste)
