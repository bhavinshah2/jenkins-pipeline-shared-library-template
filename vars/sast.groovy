def sonarQube {
  
  mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar -Dsonar.host.url='http://ef52dd317743.ngrok.io'
  
}
