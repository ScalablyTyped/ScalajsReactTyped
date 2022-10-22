organization := "org.scalablytyped.japgolly"
name := "rdfjs__fetch"
version := "3.0-dt-20211202Z-6468ba"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rdfjs__fetch-lite" % "3.0-dt-20211202Z-362046",
  "org.scalablytyped.japgolly" %%% "rdfjs__sink-map" % "1.0-dt-20211202Z-ee00f2",
  "org.scalablytyped.japgolly" %%% "rdfjs__types" % "1.1.0-052aed",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
