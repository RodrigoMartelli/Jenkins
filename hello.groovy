class Pessoa {
      String nome
      
      def apresenteSe = {
         println "Ola. Meu nome a $nome e meu delegate ${delegate.nome}"
         }
}

class Animal {
      def closure
      def nome
      
      def fale() {
        closure.delegate = this
        closure()
      }
}

def pessoa = new Pessoa(nome:"Henrique")
def animal = new Animal(nome:"Cão")
animal.closure = pessoa.apresenteSe
println(pessoa.apresenteSe)
animal.fale() //imprimirá "Ola. Meu nome e Henrique"
pessoa.nome = "Angelica"
animal.fale() //imprimirá "Ola. Meu nome e Angelica"


