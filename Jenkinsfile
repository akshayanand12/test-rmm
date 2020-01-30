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
        
        stage('Lookup Artifact') { 
            steps { 
              echo 'Lookup Artifact'
            }
        }
        
        stage('Download Artifact') { 
            steps { 
              echo 'Download Artifact'
            }
        }
        
        stage('Promote Artifact') { 
            steps { 
              echo 'Promote Artifact'
            }
        }
        
        stage('Deploy to SIT') { 
            steps { 
              echo 'Deploy to SIT'
            }
        }
        
        stage('Clean up') { 
            steps { 
              echo 'E2E Tests'
            }
        }
    }
}