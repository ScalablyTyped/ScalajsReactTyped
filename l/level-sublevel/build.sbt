organization := "org.scalablytyped.japgolly"
name := "level-sublevel"
version := "0.0-unknown-dt-20220818Z-220108"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "abstract-leveldown" % "7.2-dt-20220329Z-aaa9a6",
  "org.scalablytyped.japgolly" %%% "level-errors" % "3.0-dt-20211202Z-5b45e7",
  "org.scalablytyped.japgolly" %%% "levelup" % "5.1-dt-20220717Z-ac45eb",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
