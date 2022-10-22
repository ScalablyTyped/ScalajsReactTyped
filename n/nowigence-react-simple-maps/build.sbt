organization := "org.scalablytyped.japgolly"
name := "nowigence-react-simple-maps"
version := "1.0-dt-20220713Z-476967"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "d3-color" % "3.1-dt-20220522Z-ee6702",
  "org.scalablytyped.japgolly" %%% "d3-geo" % "3.0-dt-20211202Z-1d6d17",
  "org.scalablytyped.japgolly" %%% "d3-interpolate" % "3.0-dt-20220624Z-f5cf27",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "3.0-dt-20220720Z-ea39dc",
  "org.scalablytyped.japgolly" %%% "d3-zoom" % "3.0-dt-20220624Z-463097",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
