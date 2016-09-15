stage 'Build Docker App'

node('master'){
    git 'https://github.com/neilhunt1/Dinosaurus-SpringBoot.git'
    dir('complete'){
        sh 'mvn test'
    }
}