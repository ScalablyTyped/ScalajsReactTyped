organization := "org.scalablytyped.japgolly"
name := "blueprintjs__datetime"
version := "4.4.3-356882"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "blueprintjs__core" % "4.11.3-9a6061",
  "org.scalablytyped.japgolly" %%% "blueprintjs__icons" % "4.7.0-5a97e1",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "date-fns" % "2.29.3-3c1548",
  "org.scalablytyped.japgolly" %%% "popper_dot_js" % "1.16.1-b54a2f",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-day-picker" % "8.3.5-6f9fb7",
  "org.scalablytyped.japgolly" %%% "react-popper" % "2.3.0-cd9e54",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
