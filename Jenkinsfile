pipeline {
    agent any
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: 'master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Thrishank99/SpringbootDockerJenkinPipelineApp.git']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t thrishank99/springboot-docker-jenkin-pipelineapp .'
                }
            }
        
        }
       stage('Push image to Hub'){
            steps{
                script{
                  withCredentials([usernamePassword(credentialsId: 'dockerhubnew', passwordVariable: 'srinudockerhub', usernameVariable: 'thrishank99')]) {
                  bat "docker login -u ${env.thrishank99} -p ${env.srinudockerhub}"
}
                  bat 'docker push thrishank99/springboot-docker-jenkin-pipelineapp'
                }
            }
        }
        stage('build & SonarQube Analysis'){
            steps{
              withSonarQubeEnv('sonarqubescanner'){
              bat 'mvn clean package sonar:sonar'
            }
}
        }     
   }
}