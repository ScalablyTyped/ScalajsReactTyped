organization := "org.scalablytyped.japgolly"
name := "pixi__sprite"
version := "6.5.6-bb054e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "offscreencanvas" % "2019.7-dt-20220526Z-509f29",
  "org.scalablytyped.japgolly" %%% "pixi__constants" % "6.5.6-a7f54b",
  "org.scalablytyped.japgolly" %%% "pixi__core" % "6.5.6-0145df",
  "org.scalablytyped.japgolly" %%% "pixi__display" % "6.5.6-8e481d",
  "org.scalablytyped.japgolly" %%% "pixi__extensions" % "6.5.6-1b09f5",
  "org.scalablytyped.japgolly" %%% "pixi__math" % "6.5.6-0dd125",
  "org.scalablytyped.japgolly" %%% "pixi__runner" % "6.5.6-678891",
  "org.scalablytyped.japgolly" %%% "pixi__settings" % "6.5.6-30031c",
  "org.scalablytyped.japgolly" %%% "pixi__utils" % "6.5.6-4a3a53",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
