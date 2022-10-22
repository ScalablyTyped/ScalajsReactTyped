organization := "org.scalablytyped.japgolly"
name := "hast-to-hyperscript"
version := "10.0.1-9d51fe"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "hast" % "2.3-dt-20211202Z-d15974",
  "org.scalablytyped.japgolly" %%% "property-information" % "6.1.1-d015c1",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unist" % "2.0-dt-20220624Z-db00de",
  "org.scalablytyped.japgolly" %%% "unist-util-is" % "5.1.1-6e4019")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
