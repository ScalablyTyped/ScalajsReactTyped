organization := "org.scalablytyped.japgolly"
name := "redux-devtools-log-monitor"
version := "2.1.0-e063e5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "base16" % "1.0.0-dt-20220818Z-50b392",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "redux" % "4.2.0-cbc283",
  "org.scalablytyped.japgolly" %%% "redux-devtools" % "3.7.0-12414d",
  "org.scalablytyped.japgolly" %%% "redux-devtools-dock-monitor" % "1.2.0-25a6a2",
  "org.scalablytyped.japgolly" %%% "redux-devtools-instrument" % "1.10.0-6c526e",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
