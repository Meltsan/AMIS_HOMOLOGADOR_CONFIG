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
	          stage('clean kubernate') {
                    steps {
                        sh 'gcloud container clusters get-credentials cloud-rnd --zone us-central1-a --project amis-homologador'
                       

                    }
                }
        stage('deployKubernate') {
            steps {
                sh 'gcloud container clusters get-credentials cloud-rnd --zone us-central1-a --project amis-homologador'
                sh 'kubectl get deployments'
                sh "gcloud docker -- push gcr.io/amis-homologador/homologador-cloud-config:${env.BUILD_NUMBER}"
                sh "kubectl run homologador-cloud-config --image=gcr.io/amis-homologador/homologador-cloud-config:${env.BUILD_NUMBER} --port=8181"

            }
        }   
        }
      }