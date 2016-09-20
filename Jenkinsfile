stage 'Build Docker App'

node('master'){
        git 'https://github.com/neilhunt1/Dinosaurus-SpringBoot.git'
    docker.image('maven:3.3.3-jdk-8').inside {
        sh 'ls -lhr'
        sh 'mvn package'
    }    
    def myWebAppContainer = docker.build 'cdcdemo:'+env.BUILD_ID
    docker.withRegistry('https://218941404296.dkr.ecr.us-east-1.amazonaws.com','CDC-ECR'){
        withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'CDC-ECR',usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
            sh 'docker login -u $USERNAME -p $PASSWORD -e none https://218941404296.dkr.ecr.us-east-1.amazonaws.com'

        }
        myWebAppContainer.push()
    }
}