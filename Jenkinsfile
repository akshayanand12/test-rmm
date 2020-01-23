pipeline { 
    agent any 
    
    tools
    {
       maven 'MavenDev'
    }
     
    stages { 
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
        
        stage('Security Scans') {
        	steps {
        		echo 'This is a security scans'
        	}
        }
        
        stage('Publish Artifacts') {
        	steps {
        		echo 'Artifact publish here'
        	}
        }
        
        stage('Deploy') {
        	steps {
        		echo 'Artifact publish here'
        	}
        }
        
        stage('API Tests') {
        	steps {
        		echo 'BDD tests run here'
        	}
        }
        
        stage('Clean up') {
        	steps {
        		echo 'Artifact publish here'
        	}
        }
    }
}