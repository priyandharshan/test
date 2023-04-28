node {
    def dockerImageTag ="spring-boot-deploy"
        stage('clone repo')
        {
            git url:'https://github.com/priyandharshan/test.git',
            branch :'main'
        }
        stage('Deploy docker')
        {
         script {
                 bat 'docker-compose -f docker-compose.yml up -d'
              }
             }

    }
