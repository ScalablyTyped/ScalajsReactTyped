organization := "org.scalablytyped.japgolly"
name := "x-ray"
version := "2.3-dt-20211202Z-138dfe"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20211202Z-a6fb67",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20220923Z-dde6a1",
  "org.scalablytyped.japgolly" %%% "http-context" % "1.1-dt-20211202Z-16fc1f",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "x-ray-crawler" % "2.0-dt-20211202Z-1a9258")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
