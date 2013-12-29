name := "aima-scala"

version := "0.1"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0" % "test"

libraryDependencies +=  "org.scalacheck" %% "scalacheck" % "1.11.1" % "test"

libraryDependencies += "junit" % "junit" % "4.11" % "test"
   