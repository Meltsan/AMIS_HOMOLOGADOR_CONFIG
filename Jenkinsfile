pipeline {
    agent any

    stages {
	        stage('init') {
	            steps {
	
	                echo "Building.. ${env.BRANCH_NAME}"
	                checkout scm
	                sh 'chmod 777 ./gradlew'
	                sh './gradlew clean'
	            }
	        }
	        stage('buildImage') {
	            steps {
	                sh './gradlew buildImage'
	            }
	        }   
        }
      }