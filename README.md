# Cipher-Dicipher-using-Java
A brute_force based Cipher-Dicipher written in Java Language with UI/UX

# Objective:
The main objective of this project is to build a portable program for Encryption and Decryption using Packages.
Users can implement these packages into their program to run Cipher. Here, we have shown a glimpse of its implementation in a fully functional applet programming.

# Introduction:
This project has made us understand the concepts and implementations of package in a better way. The key idea behind this project is to build a portable cipher for daily and general use. Most of the Ciphers available in industry are based on some Algorithms (RSA Algo- Most famous one). They somehow provide some strong and secure method of data encryption/decryption. But this Cipher built by us shows uniqueness in itself. We have built this Cipher without any algo or logic, which makes it impossible to decode by cyber attackers. One can decode it by using the Cheat Sheet only owned by the developer itself.  
We have implemented this Cipher in an Applet. One can build a jar file out of it, and can implement this cipher in messaging and communication systems (Web Apps) to hide their texts and privacy.

# Software Requirements:
1. Java software kit (JDK/ JRE - Ver._1.8)
2. Text Editor (Notepad/ Ecllipse IDE)
3. MS-DOS

# Key-Note:
-> You can run this application through BASH window (DOS- cmd prompt) or through and APPLETVIEWER.

# Methodology:
•	There are two source files kept in the package serving different purposes; namely:
1.	**Cipher.java**: containing parameterized methods encrypt() and decrypt(). Its class file is implemented in the Applet programming.
2.	**CipherImplement.java**: containing non-parameterized methods encrypt() and decrypt(), both of which are taking inputs of String through Scanner() method.

•	Structure of the package:
PBL_TESTING\            -----Base Directory
Com->pbl->cipher      -----Package name

•	Two Test Files, namely:
1.	 **expack.java**: Implementing the CipherImplement.class file. Program is tested on MS-DOS after compiling and interpreting the source file.
2.	**CipherApplet.java**: Implementing the Cipher.class file. Program is tested on an Applet. Two buttons are given to encrypt the message thrown in text box, and then another button to decrypt that encrypt message to receive the original message again.

•	This program is capable to encrypt/ decrypt a single word or a complete sentence as per requirement.

•	To run DOS Test file:
>> **java Testcipher**

•	To run Applet program from DOS (Applet viewer):
>> **appletviewer CipherApplet.java**
