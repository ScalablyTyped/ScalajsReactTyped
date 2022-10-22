organization := "org.scalablytyped.japgolly"
name := "hast-util-to-nlcst"
version := "2.2.0-ccc859"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "hast" % "2.3-dt-20211202Z-d15974",
  "org.scalablytyped.japgolly" %%% "nlcst" % "1.0-dt-20220624Z-438137",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unist" % "2.0-dt-20220624Z-db00de",
  "org.scalablytyped.japgolly" %%% "vfile" % "5.3.5-a9a4b9",
  "org.scalablytyped.japgolly" %%% "vfile-message" % "3.1.2-85db16")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
