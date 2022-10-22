organization := "org.scalablytyped.japgolly"
name := "antv__component"
version := "0.8.28-66db6c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "antv__event-emitter" % "0.1.3-c14297",
  "org.scalablytyped.japgolly" %%% "antv__g-base" % "0.5.11-18926b",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "3.0-dt-20211202Z-2ee647",
  "org.scalablytyped.japgolly" %%% "gl-matrix" % "3.4.3-a577e0",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
