pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build is done'
            }
        }
            stage('Test') {
            steps {
                echo 'Testing is completed'
            }
        }
             stage('Deploy') {
            steps {
                echo 'Deployment is done'
            }
        }
    }
    post{
        always{
           emailext body: 'summary', subject: 'Pipeline', to: 'kavadiusharani@gmail.com'
        }
    }
}
