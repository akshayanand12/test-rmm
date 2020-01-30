pipeline { 
    agent any 
    
    tools
    {
       maven 'MavenDev'
    }
     
    stages { 
    
    	stage('Clone') { 
	    	steps {
	        		echo 'Clone'
	        }  
        }
        
        stage('Build') { 
            steps { 
              git branch: 'master', url: 'https://github.com/akshayanand12/test-rmm.git'
              script {
                  def pom = readMavenPom file: 'pom.xml'
                  version = pom.version
              }
              sh "mvn install -DskipTests=true"
            }
        }
        
        stage('Unit Tests') {
        	steps {
        		echo 'This is a unit test stage'
              	sh "mvn test -Dspring.profiles.active=test"
        	}
        }
        
        stage('Visual Tests') {
        	steps {
	        	echo 'Visual Tests'
	        }  
        }
        
        stage('Contract Tests') {
        	steps {
	        	echo 'Contract Tests'
	        }  
        }
        
        stage('Security Scans') {
        	steps {
        		echo 'This is a security scans'
        	}
        }
        
        stage('Publish to Nexus') {
        	steps {
        		echo 'Artifact publish here'
        	}
        }
        
        stage('PCF Deploy') {
        	steps {
        		echo 'Deploy to PCF'
        	}
        }
        
        stage('BDD Tests') {
        	steps {
        		echo 'BDD tests run here'
        	}
        }
        
        stage('PCF Delete') {
        	steps {
        		echo 'PCF Delete'
        	}
        }
        
        stage('Clean up') {
        	steps {
        		echo 'Clean up'
        	}
        }
    }
}