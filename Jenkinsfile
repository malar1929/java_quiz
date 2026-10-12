pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac java_quiz.java'
                    } else {
                        bat 'javac java_quiz.java'
                    }
                }
            }
        }
    }
}
