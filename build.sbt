addCommandAlias("namaste", "~testOnly org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.0"

scalaVersion := "2.12.3"

traceLevel := -1

logLevel := Level.Info


// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"  % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

