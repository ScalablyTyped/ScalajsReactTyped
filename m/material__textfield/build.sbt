organization := "org.scalablytyped.japgolly"
name := "material__textfield"
version := "14.0.0-198d48"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "material__base" % "14.0.0-29b455",
  "org.scalablytyped.japgolly" %%% "material__floating-label" % "14.0.0-401a87",
  "org.scalablytyped.japgolly" %%% "material__line-ripple" % "14.0.0-25544d",
  "org.scalablytyped.japgolly" %%% "material__notched-outline" % "14.0.0-e0e38c",
  "org.scalablytyped.japgolly" %%% "material__ripple" % "14.0.0-caf9c9",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
