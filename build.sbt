import SonatypeKeys._
import sbt.Keys._
import sbt._

lazy val core = (project in file("core")).settings(releaseSettings ++ sonatypeSettings ++ Seq(
  organization := "com.codemettle",
  name := "scalajs-react-materialui-icons",
  version := "0.1.0",
  description := "Material UI icons for scalajs-react-components",
  startYear := Some(2015),
  homepage := Some(url("https://github.com/Codemettle/scalajs-react-materialui-icons")),
  organizationName := "CodeMettle, LLC",
  organizationHomepage := Some(url("http://www.codemettle.com")),
  licenses += ("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")),
  scmInfo := Some(
    ScmInfo(url("https://github.com/CodeMettle/scalajs-react-materialui-icons"),
      "scm:git:https://github.com/CodeMettle/scalajs-react-materialui-icons.git",
      Some("scm:git:git@github.com:CodeMettle/scalajs-react-materialui-icons.git"))),
  pomExtra := {
    <developers>
      <developer>
        <name>Steven Scott</name>
        <email>steven@codemettle.com</email>
        <url>https://github.com/codingismy11to7/</url>
      </developer>
    </developers>
  },
  scalaVersion := "2.11.7",
  libraryDependencies ++= Seq(
    "com.github.japgolly.scalajs-react" %%% "core" % "0.10.2" % Provided,
    "com.github.chandu0101.scalajs-react-components" %%% "core" % "0.2.0" % Provided
  ),
  profileName := "com.codemettle"
): _*)
 .enablePlugins(ScalaJSPlugin)

