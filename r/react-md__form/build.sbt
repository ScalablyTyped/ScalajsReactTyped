organization := "org.scalablytyped.japgolly"
name := "react-md__form"
version := "5.1.4-431325"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-md__button" % "5.1.3-031b1d",
  "org.scalablytyped.japgolly" %%% "react-md__list" % "5.1.3-128c9e",
  "org.scalablytyped.japgolly" %%% "react-md__portal" % "5.1.0-289cc5",
  "org.scalablytyped.japgolly" %%% "react-md__states" % "5.1.3-650277",
  "org.scalablytyped.japgolly" %%% "react-md__tooltip" % "5.1.3-dcf680",
  "org.scalablytyped.japgolly" %%% "react-md__transition" % "5.1.3-ba7c22",
  "org.scalablytyped.japgolly" %%% "react-md__utils" % "5.1.3-ec8fdc",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
