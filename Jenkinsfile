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
              echo 'Performance Tests'
            }
        }
        
        stage('Unit Tests') { 
            steps { 
              echo 'Unit Tests'
            }
        }
        
        stage('Contract Tests') { 
            steps { 
              echo 'Contract Tests'
            }
        }
        
        stage('Security Scans') { 
            steps { 
              echo 'Security Scans'
            }
        }
        
        stage('Publish to Nexus') { 
            steps { 
              echo 'Publish to Nexus'
            }
        }
        
        stage('PCF Deploy') { 
            steps { 
              echo 'PCF Deploy'
            }
        }
        
        stage('Run API Tests') { 
            steps { 
              echo 'Run API Tests'
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