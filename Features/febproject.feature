Feature: Social Network

  Scenario: Fb login3
    Given Open fb and launch the application
    When I enter the user credentials
    Then Close the browser
    
    
    
  #Scenario Outline: Fb login1
    #Given Open fb and launch the application
    #When I enter the user credentials "<username>" and "<password>"
    #And supporting statement one
    #But supporting statement two
    #Then Close the browser
#
    #Examples: 
      #| username | password |
      #| Rajesh   | Pwd      |
      #| Aslam    | Pwd      |
      #| Khan     | Pwd      |
  #Scenario: Fb login1
    #Given Open fb and launch the application
    #When I enter the user credentials
    #Then Close the browser
