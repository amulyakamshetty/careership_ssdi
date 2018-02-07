Before reading this document make sure to read and install all the softwares required from InstallIntructions file

How to Run?

1.) Unzip/copy CareerShip folder which has all code to any local workspace.

2.) Open eclipse.
    Click File > Import.
    Type Maven in the search box under Select an import source:
    Select Existing Maven Projects.
    Click Next.
    Click Browse and select the folder(careership) that is the root of the Maven project  (contains the pom.xml file)
    Click Next.
    Click Finish.

3.) Now project is ready we need to clear build errors for that copy external jars folder to desktop and 
    You can add all jars in external jars folder(mail_1.4.jar  and mysql-connector-java-5.1.40-bin.jar) in Eclipse by right-clicking on the       Project → Build Path → Configure Build Path. Under Libraries tab, click  Add External JARs and select mail_1.4.jar and mysql-connector-java-5.1.40-bin.jar.


4.) Finally we need to run the DB script in mysql.

5.) Open mysql instance in terminal/console connect using mysql -u<UName> -p<Password>

6.) Now you would in SQL> prompt now copy whole content is DB Script file and paste.

7.) All the Database tables will be created.


8.) Go back to eclipse project folder rightclick run as mavenbuild in the goals specify tomcat7:run click run

9.)Now open browser and type http://localhost:8080/vjf/home home page is displayed.
