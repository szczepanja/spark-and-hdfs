ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.9"

lazy val root = (project in file("."))
  .settings(
    name := "spark-and-hdfs"
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1"
