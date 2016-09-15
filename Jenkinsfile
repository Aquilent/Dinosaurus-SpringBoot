stage 'Build Docker App'

node('master'){
    docker.image('maven:3.3.3-jdk-8').inside {
        git 'https://github.com/neilhunt1/Dinosaurus-SpringBoot.git'
        sh 'ls -lhr'
        sh 'mvn package'
    }

}