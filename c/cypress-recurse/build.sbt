organization := "org.scalablytyped.japgolly"
name := "cypress-recurse"
version := "1.23.0-eabf58"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "buffer" % "6.0.3-40f891",
  "org.scalablytyped.japgolly" %%% "cypress" % "10.10.0-fffd5c",
  "org.scalablytyped.japgolly" %%% "eventemitter2" % "6.4.9-3b8498",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-f8d735",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
