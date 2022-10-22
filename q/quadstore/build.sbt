organization := "org.scalablytyped.japgolly"
name := "quadstore"
version := "11.0.6-2e02a9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "abstract-level" % "1.0.3-0eb917",
  "org.scalablytyped.japgolly" %%% "asynciterator" % "3.7.1-427053",
  "org.scalablytyped.japgolly" %%% "level-supports" % "4.0.1-1aa484",
  "org.scalablytyped.japgolly" %%% "level-transcoder" % "1.0.1-34cc02",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rdfjs__types" % "1.1.0-052aed",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
