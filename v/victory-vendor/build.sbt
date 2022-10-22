organization := "org.scalablytyped.japgolly"
name := "victory-vendor"
version := "36.6.8-fed8a2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "d3-array" % "3.0-dt-20220624Z-12a885",
  "org.scalablytyped.japgolly" %%% "d3-color" % "3.1-dt-20220522Z-ee6702",
  "org.scalablytyped.japgolly" %%% "d3-ease" % "3.0-dt-20211223Z-e9a5b1",
  "org.scalablytyped.japgolly" %%% "d3-interpolate" % "3.0-dt-20220624Z-f5cf27",
  "org.scalablytyped.japgolly" %%% "d3-path" % "3.0-dt-20220310Z-c74868",
  "org.scalablytyped.japgolly" %%% "d3-scale" % "4.0-dt-20220624Z-718053",
  "org.scalablytyped.japgolly" %%% "d3-shape" % "3.1-dt-20220624Z-7b0e71",
  "org.scalablytyped.japgolly" %%% "d3-time" % "3.0-dt-20211202Z-0604bb",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "3.0-dt-20211202Z-2ee647",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
