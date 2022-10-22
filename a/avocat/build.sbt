organization := "org.scalablytyped.japgolly"
name := "avocat"
version := "2.0-dt-20211202Z-61dff7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "hapi__boom" % "10.0.0-5c8657",
  "org.scalablytyped.japgolly" %%% "hapi__catbox" % "10.2-dt-20211202Z-0c1ff3",
  "org.scalablytyped.japgolly" %%% "hapi__hapi" % "20.0-dt-20220525Z-1c9204",
  "org.scalablytyped.japgolly" %%% "hapi__iron" % "7.0.0-613230",
  "org.scalablytyped.japgolly" %%% "hapi__mimos" % "7.0.0-ed34ce",
  "org.scalablytyped.japgolly" %%% "hapi__shot" % "6.0.0-f7515a",
  "org.scalablytyped.japgolly" %%% "joi" % "17.6.3-89f02e",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
