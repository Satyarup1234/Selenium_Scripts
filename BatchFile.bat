set projectLocation=C:\Users\KIIT\eclipse-workspace\Frame_Works
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testSuiteUsingClasses.xml
