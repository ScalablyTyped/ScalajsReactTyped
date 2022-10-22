organization := "org.scalablytyped.japgolly"
name := "ionic__cli-framework"
version := "5.1.3-df498d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework-output" % "2.2.5-c60503",
  "org.scalablytyped.japgolly" %%% "ionic__utils-object" % "2.1.5-a4933b",
  "org.scalablytyped.japgolly" %%% "ionic__utils-terminal" % "2.3.3-c08904",
  "org.scalablytyped.japgolly" %%% "minimist" % "1.2-dt-20211202Z-6b7ca4",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "string-width" % "5.1.2-b3e063")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
