package Jenkins

class Pessoa {
      String nome
      
      def apresenteSe = {
         println "Ola. Meu nome a $nome e meu delegate ${delegate.nome}"
         }
}
