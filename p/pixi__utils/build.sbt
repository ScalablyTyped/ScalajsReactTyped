organization := "org.scalablytyped.japgolly"
name := "pixi__utils"
version := "6.5.6-4a3a53"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "pixi__constants" % "6.5.6-a7f54b",
  "org.scalablytyped.japgolly" %%% "pixi__settings" % "6.5.6-30031c",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
