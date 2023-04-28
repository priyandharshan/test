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
            script {
            		if (isUnix()) {
            						sh "mvn clean package -DskipTests"
            		} else {
            						bat "mvn clean package -DskipTests"
            			}
            	}
        }

    }
}
