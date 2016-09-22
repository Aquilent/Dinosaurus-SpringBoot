

node('master'){
    stage 'Build Docker App'
//    sh 'rm -rf *'
//    git 'https://github.com/neilhunt1/Dinosaurus-SpringBoot.git'
//    docker.image('maven:3.3.3-jdk-8').inside {
//        sh 'ls -lhr'
//        sh 'mvn package'
//    } 
//    def myWebAppContainer = docker.build 'cdcdemo:'+env.BUILD_ID
    stage 'Push and Register Container'
//    docker.withRegistry('https://218941404296.dkr.ecr.us-east-1.amazonaws.com','CDC-ECR'){
//        withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'CDC-ECR',usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
//            sh 'docker login -u $USERNAME -p $PASSWORD -e none https://218941404296.dkr.ecr.us-east-1.amazonaws.com'
//        }
//        myWebAppContainer.push()
//    }
    def myJson = sh "aws ecs register-task-definition --family spring-boot-task --container-definitions '[{\"name\":\"spring-boot-container\",\"image\":\"218941404296.dkr.ecr.us-east-1.amazonaws.com/cdcdemo:85\",\"cpu\":1,\"portMappings\": [{\"hostPort\": 80,\"containerPort\":8080,\"protocol\":\"tcp\"}],\"memoryReservation\":512,\"essential\":true}]' --region us-east-1"
	echo "myJson IS "+myJson
    stage 'Deploy to DEV Cluster'
	
	//sh "aws ecs update-service --cluster SpringBootCluster --service spring-boot-service --task-definition spring-boot-task:"+env.BUILD_ID+" --region us-east-1"
}