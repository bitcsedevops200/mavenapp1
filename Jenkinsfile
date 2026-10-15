pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Repository checked out by Jenkins.'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn -B clean package'
            }
        }

        stage('Run Application') {
            steps {
                sh 'java -jar target/mavenapp-1.0-SNAPSHOT.jar'
            }
        }

        stage('Verify File Copy') {
            steps {
                sh 'test -f source.txt'
                sh 'test -f dest.txt'
                sh 'diff -u source.txt dest.txt'
                echo 'Source and destination files match.'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            echo 'Pipeline completed successfully.'
        }

        failure {
            echo 'Pipeline failed. Check Console Output.'
        }
    }
}
