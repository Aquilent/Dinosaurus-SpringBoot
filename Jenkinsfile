stage 'Build Docker App'

node('master'){
    git url: https://github.com/spring-guides/gs-spring-boot-docker.git
    dir('complete'){
        sh 'mvn test'
    }
}