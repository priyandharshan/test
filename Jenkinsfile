#!groovy

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/priyandharshan/test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

    }
}
