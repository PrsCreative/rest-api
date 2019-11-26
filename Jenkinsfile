
pipeline{
	environment{
	    deployment="c2h-payment-api"
	    namespace="c2h-sit"
		imageName="$namespace/$deployment"
		dockerImage=''
		appversionbuild="0"
		majorbuild="0"

	}
    agent any
    options {
        skipDefaultCheckout()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

	stages {
        stage('Checkout & Build') {
            agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v /datajkn/mvn/.m2:/root/.m2'
                }
            }
            steps {
                checkout scm

                sh '''
                mvn versions:set -DnewVersion=${buildversion}
                mvn clean package -DskipTests
                '''
            }
        }


        stage('Build & Push images') {
            agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v /datajkn/mvn/.m2:/root/.m2'
                }
            }
            steps {
                sh  '''
        	        mvn dockerfile:build
        		    mvn dockerfile:push
        		    '''
                }
        }

    }// end stages
} //end pipeline
