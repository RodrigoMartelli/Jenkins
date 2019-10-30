@Library('Jenkins@master')
import Jenkins.*

stage 'Checkout'
    node {
        deleteDir()
        checkout scm
    }
 
stage 'Build'
    node {
        script {
           
            def pessoa = new Pessoa(nome:"Henrique")
            def animal = new Cachorro(nome:"Cão")
            animal.closure = pessoa.apresenteSe
            println(pessoa.apresenteSe)
            animal.fale() //imprimirá "Ola. Meu nome e Henrique"
            pessoa.nome = "Angelica"
            animal.fale() //imprimirá "Ola. Meu nome e Angelica"
        }
    }





