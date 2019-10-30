package Jenkins

class Cachorro {
      def closure
      def nome
      
      def fale() {
        closure.delegate = this
        closure()
      }
}