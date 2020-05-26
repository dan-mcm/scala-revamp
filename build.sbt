import Versions._

name := "hello-world"
organization := "ie.mcmahon"
organizationName := "McMahon"

scalaVersion := "2.13.1"

version := "1.0"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % catsCore,
  "org.scala-lang.modules" %% "scala-parser-combinators" % scalaParserCombinator,
  "com.typesafe.scala-logging" %% "scala-logging" % scalaLogging,
  "ch.qos.logback" % "logback-classic" % logbackClassic,
  "org.scalatest" %% "scalatest" % scalaTest % Test
)

