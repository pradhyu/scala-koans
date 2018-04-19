
# README #

Installation/Getting Started
To run the koans, you need a JDK (1.6+). Scala, SBT and scalatest are packaged with the koans distribution.

If you use mercurial, you can stay updated with the project by cloning the repository at:

hg clone ssh://hg@bitbucket.org/dmarsh/scalakoansexercises
If you don’t know or don’t care what that means …

Download a copy of the Koans Exercises and extract to a directory on your computer, then run the SBT that comes pre-packaged with the koans.

Linux and Mac:
$ ./koans
Note (for Linux users): You may need to change your sbt to be executable. For example,

> chmod +x ./koans
Windows:
c:scalakoansexercises> koans.bat
Running the koans
The Scala Koans Exercises are now using Luke Amdor’s runner and SBT 0.10. To start, type the following at the SBT prompt:

> namaste
Or, you can run specific koans (e.g., AboutAsserts) with:

> ~testOnly org.functionalkoans.forscala.AboutAsserts
This will run the koans, and you will get a “Pending” status from the tests when the failure is a result of a “fill in the blank” error or an “Error” when you’ve filled it in with something wrong. From that point on, you will be able to edit the Scala files and make appropriate changes to get the tests to work.

SBT will run the tests when you make changes. Scroll back through the messages to the first error and make the change to fix the error.

Where to start
Finding Your Path will give you suggestions for which test to run, depending on your interest and background.

If you want to jump in without direction, you will find the Scala files to modify in:

src/test/scala/org/functionalkoans/forscala

Stuck?
If you get stuck, please let us know which koans are tricky through the Contact form. This almost certainly means that we haven’t done a good job of explaining the concepts, and your input will help us to improve the koans. In the meantime, you can download the solutions from:

https://bitbucket.org/dickwall/scala-koans/get/tip.zip

