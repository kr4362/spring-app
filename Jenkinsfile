pipeline  {
  
    agent any
  
  environment
  {
    
    BUILD_VERSION='0.0.1'
    
  }
  
  stages{
    
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
  
