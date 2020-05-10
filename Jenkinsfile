pipeline {

	agent any

	stages {

		stage('Example Deploy') {
            when {
                branch 'master'
            }
            steps {
                echo 'Deploying master'
            }
        }
	
		stage('****clean*****') {
		
            when {
                branch 'master'
                environment name: 'DEPLOY_TO', value: 'production'
            }
		
			steps{
				sh "mvn clean"
			}
		}

		stage('****test*****') {
			steps{
				sh "mvn test"
			}
		}

		stage('****package*****') {
			steps{
				sh "mvn package"
			}
		}
	}
	
}