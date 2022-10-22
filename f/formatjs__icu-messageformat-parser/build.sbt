organization := "org.scalablytyped.japgolly"
name := "formatjs__icu-messageformat-parser"
version := "2.1.10-c458c7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "formatjs__ecma402-abstract" % "1.13.0-24d87c",
  "org.scalablytyped.japgolly" %%% "formatjs__icu-skeleton-parser" % "1.3.14-a4a222",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
