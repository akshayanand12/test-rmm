pipeline { 
    agent any 
    
    tools
    {
       maven 'MavenDev'
    }
     
    stages { 
    
    	stage('e2e Tests') { 
	    	steps {
	        		echo 'e2e Tests'
	        }  
        }
        
        stage('Performance Tests') { 
            steps { 
              echo 'Performance Tests'
            }
        }
        
        stage('Security Tests') { 
            steps { 
              echo 'Security Tests'
            }
        }
        
        stage('Chaos Tests') { 
            steps { 
              echo 'Chaos Tests'
            }
        }
        
        stage('Responsive Web Tests') { 
            steps { 
              echo 'Responsive Web Tests'
            }
        }
    }
}