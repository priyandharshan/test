#!groovy

pipeline {
	agent none
  stages {
    stage('Docker Build') {
    	agent any
      steps {
      	sh 'mvn clean install'
      }
    }
  }
}