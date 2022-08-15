set projectLocation=D:\Ranjeet\Hybride_Fw
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Testng.xml
pause