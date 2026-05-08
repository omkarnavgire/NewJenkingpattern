pipeline {
    agent any
    tools {
        maven 'Maven 3.x' 
        jdk 'Java 25'  
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm 
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'  
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test' 
            }
        }

        stage('Artifact Archiving') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
