#!groovy


pipeline {
    agent any

    stages {
        stage 'Checkout'
           node {
                deleteDir()
                checkout scm
            }
    

        stage('Build') {
            steps {
                script { 
                echo 'Building..'
                //def pessoa = new Pessoa(nome:"Henrique")
                //def animal = new Cachorro(nome:"Cão")
                //animal.closure = pessoa.apresenteSe
                //println(pessoa.apresenteSe)
                //animal.fale() //imprimirá "Ola. Meu nome e Henrique"
                //pessoa.nome = "Angelica"
                //animal.fale() //imprimirá "Ola. Meu nome e Angelica"                
            }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('Sexta Breja') {
            steps {
                echo 'Iniciando a segundona, treinamento jenkins....'
            }
        }
    }
}

