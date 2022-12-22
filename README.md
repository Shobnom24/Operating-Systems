# Java-RMI-MagicMath
A simple Java RMI Application with magic math server and client

# Running
Go to the directory containing calculatorrmi directory. 

step 1: building java files

javac calculatorrmi/CalculatorInterface.java
javac calculatorrmi/CalculatorRmi.java
javac calculatorrmi/CalculatorServer.java
javac calculatorrmi/Client.java

step 2: 

Run server first
java calculatorrmi/CalculatorServer

Then run the client ( 2 client will start running. if you want more clients then copy paste line 114 in Client.java with changing client name.)
java calculatorrmi/Client

# Run on different machines 
Just need to update line 112 in Client.java with replacing localhost with the ip address of the machine where Server is running. (see line 113 for example). 
Make sure both machines can ping each other.
Machine 1 (server) :  java calculatorrmi/CalculatorServer
Machine 2 (client) :  java calculatorrmi/Client
