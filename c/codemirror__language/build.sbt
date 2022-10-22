organization := "org.scalablytyped.japgolly"
name := "codemirror__language"
version := "6.2.1-9f90e6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "codemirror__state" % "6.1.1-05fe94",
  "org.scalablytyped.japgolly" %%% "codemirror__view" % "6.2.4-0a3a57",
  "org.scalablytyped.japgolly" %%% "lezer__common" % "1.0.1-3c4c48",
  "org.scalablytyped.japgolly" %%% "lezer__highlight" % "1.1.0-c4083a",
  "org.scalablytyped.japgolly" %%% "lezer__lr" % "1.2.3-c42076",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "style-mod" % "4.0.0-00efda")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
