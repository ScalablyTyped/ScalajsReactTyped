organization := "org.scalablytyped.japgolly"
name := "theme-ui"
version := "0.15.1-ed3433"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "emotion__react" % "11.10.4-083599",
  "org.scalablytyped.japgolly" %%% "emotion__serialize" % "1.1.0-4488ed",
  "org.scalablytyped.japgolly" %%% "emotion__utils" % "1.2.0-a48080",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "theme-ui__color-modes" % "0.15.1-19159e",
  "org.scalablytyped.japgolly" %%% "theme-ui__components" % "0.15.1-ae9af4",
  "org.scalablytyped.japgolly" %%% "theme-ui__core" % "0.15.1-5544f1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
