pipeline {
    agent none
    stages {
	   agent { docker  'maven3.8.4-openjdk-11-slim' } 
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
