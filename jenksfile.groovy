#!groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                
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
                echo 'Finalizacao da sexta, agora so segundona....'
            }
        }
    }
}

