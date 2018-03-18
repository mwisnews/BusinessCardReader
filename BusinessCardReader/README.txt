BusinessCardReader

The following program was written in Java using the NetBeans IDE 8.2. (Running Java 1.8.0_161)
This particular program is designed to read in data that has been scanned into a file using an OCR (optical character
recognition) component. The program searches through the file for the name, phone number and email address listed on the 
buiness card and returns them to the user.

Getting Started:

To obtain a copy of this project. Pull it from my GitHub page mwisnews/BusinessCardReader, this should provide you with a
folder containing all of the necessary build and source files as well as 3 example files I have included. If you wish to test
another example file, it is important to store the file to be tested in this folder with the other example files. 
This project can be run on the NetBeans IDE 8.2. For more information as to how to run the project when NetBeans IDE 8.2 
is installed see the deployment section.

Prerequisites:

This project requires JDK (Java Developement Kit) which can be downloaded 
as Java SE 9 from http://www.oracle.com/technetwork/java/javase/downloads/index.html 
(Note: Be sure to download the version corresponding to your computer's correct operating system)

This project requires NetBeans IDE 8.2 to run, which can be downloaded from https://netbeans.org/
(Note: Be sure to download the version corresponding to your computer's correct operating system)

Deployment:

Make sure that the JDK and NetBeans have been installed and the program has been pulled from my GitHub. 
First, load up NetBeans IDE 8.2 and in the top right File menu, click "Open Project". Next, select the project 
"BusinessCardReader" from wherever it was pulled to. The project should now appear in the left "Projects" sidebar.
To open the code for the project, click the "+" next to the project name, then click the "+" next to "Source Packages"
and then click the "+" next to the "businesscardreader" package and finally, click the file "BusinessCardReader.java".
The code should now be displayed in the main window of the NetBeans IDE. To run the program, go to the "Run" menu and click
"Run Project (BusinessCardReader)" or just hit the green arrow located right under the "g" in the "Debug" menu name.

IMPORTANT: IF YOU WISH TO CHANGE THE FILE BEING TESTED GO TO LINES 30 AND 32 AND CHANGE THE NAMES IN THE 
"new java.io.File("INSERT_FILE_NAME_HERE");" AND "new FileReader("INSERT_FILE_NAME_HERE");"
MAKE SURE THE TWO FILE NAMES MATCH OR ELSE THE PROGRAM WILL NOT RUN. ALL EXAMPLE FILES MUST BE STORED IN THE MAIN 
BusinessCardReader FOLDER.

Examples of properly included files are ExampleOne.dat, ExampleTwo.dat, and ExampleThree.dat which have already been included

The output of the program should appear in a window below the code window. If implements right, the ExampleOne.dat output
should read:
		Name: Mike Smith
		Phone: (410)555-1234
		Email: msmith@asymmetrik.com

Comments have been given to explain the code line by line.

Note: There exists a bug in trying to compile ExampleThree.dat. I am aware that when run, the name extracted from the
business card is "Software Engineer". This is because both "Arthur Wilson" and "Software Engineer" both match the Regex
pattern I had set up. "Arthur Wilson" is passed first and so the program sets the name to "Arthur Wilson" but then this gets
overwritten by "Softward Engineer" which becomes the output. I thought about this issue and determined that to imporve the
program, one would need to implement some Named-entity Recognition (NER) to determine whether the string in question is a
name or a title.

Thank you for reading this far, I know this is quite a bit of text. I hope you enjoy the program, I have a busy week ahead
with 4 tests and an interview to prepare for.

Author:

	Matthew Wisnewski, student at Stevens Institute of Technology - The whole project

Acknowledgements:

	Professor Dov Kruger and the EE-552 course website for a Regex reference guide
	






