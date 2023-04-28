node {
    def dockerImageTag ="spring-boot-deploy"
    try{
        notifyBuild('STARTED')
        stage('clone repo')
        {
            git url:'https://github.com/priyandharshan/test.git',
            branch :'main'
        }
        stage('Deploy docker')
        sh 'docker-compose -f docker-compose.yml -d'
    }
    }catch(e){
        currentBuild.result = "FAILED"
        throw e
    }finally{
        notifyBuild(currentBuild.result)
     }

    }
