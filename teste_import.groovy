import Jenkins.*
import groovy.util.*


def pessoa = new Pessoa(nome:"Henrique")
def animal = new Cachorro(nome:"Cão")
animal.closure = pessoa.apresenteSe
println(pessoa.apresenteSe)
animal.fale() //imprimirá "Ola. Meu nome e Henrique"
pessoa.nome = "Angelica"
animal.fale() //imprimirá "Ola. Meu nome e Angelica"

println('teste')