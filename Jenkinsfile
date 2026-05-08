pipeline {
    agent any
    tools {
        maven 'Maven'       // ✅ must match Global Tool Configuration
        jdk 'JDK_HOME'       // ✅ must match Global Tool Configuration
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
