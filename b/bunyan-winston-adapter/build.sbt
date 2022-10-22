organization := "org.scalablytyped.japgolly"
name := "bunyan-winston-adapter"
version := "0.2-dt-20211202Z-c77990"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20211202Z-40b88d",
  "org.scalablytyped.japgolly" %%% "logform" % "2.4.2-fd6c39",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "winston" % "3.8.2-232acd",
  "org.scalablytyped.japgolly" %%% "winston-transport" % "4.5.0-92bc1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
