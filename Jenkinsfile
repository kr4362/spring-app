pipeline  {
  
    agent any
  
  environment
  {
    
    BUILD_VERSION='0.0.1'
    PATH="$PATH:$MAVEN_HOME/bin"
    
  }
  
  stages{
    
    stage("Sonar Analysis")
    {
      
      steps
      {
        
        withSonarQubeEnv("sonarqube-9.8")
        {
          
            sh "mvn sonar:sonar"
          
        }
        
        
      }
      
    }
    
    stage("build"){
      
      steps{
        
        echo "I am building ${BUILD_VERSION}";
        
        
      }
      
    }
    
    stage("deploy"){
      
       steps{
        echo "I am deploying ${BUILD_VERSION}";   
      }
     
    }
     
  }
  
  post{
  
    always{
      echo "ALWAYS";
    
    }
    
    success{
    
       echo "SUCCESSS";
    
    }
    
    failure{
      
       echo "FAILURE";
    }
      
  
  }
  
}
  
