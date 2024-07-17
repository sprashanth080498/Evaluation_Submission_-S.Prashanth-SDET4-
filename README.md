A)Project Title
  1)Selenium Automation For handling the Alerts and Frames
  2)Selenium automation - Selenium is an open source framework for automated browser teting and web application automation offering a suite of tools to interact with the web browsers programmatically.
B) Name: S.Prashanth 
C)Description of the project
  Here I have created two classes frames.java and alerts.java in which I have handledand a frame and three alerts  in the websites url given below: 
    1)https://rahulshettyacademy.com/AutomationPractice/
    2)https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette
D)How to setup and run the project
  1) Install the STS IDE
  2) Open the IDE after installation
  3) Create a package in the "src/test/java".
  4) Create a class in the package.
  5) Add the following dependencies mentioned under the topic dependencies in the pom.xml-
  6) Go to help , Eclipse marketplace and install the testng plugin
  7) Start writing the script for the automation
  8) Run the project as "Run as TestNG"
     
  Dependencies:
    <project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>
      <groupId>demo_project_selenium</groupId>
      <artifactId>demo_project_selenium</artifactId>
      <version>0.0.1-SNAPSHOT</version>
      <dependencies>
    	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.8.0</version>
    </dependency>
    
    </dependencies>
    </project>
    Dependencies and prerequisites needed
