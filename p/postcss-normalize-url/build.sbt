organization := "org.scalablytyped.japgolly"
name := "postcss-normalize-url"
version := "5.1.0-738bda"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "normalize-url" % "7.2.0-dc6b23",
  "org.scalablytyped.japgolly" %%% "postcss" % "8.4.18-e06f87",
  "org.scalablytyped.japgolly" %%% "source-map-js" % "1.0.2-971b9b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
