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
