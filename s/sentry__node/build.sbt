organization := "org.scalablytyped.japgolly"
name := "sentry__node"
version := "7.13.0-4a23bd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "sentry__core" % "7.15.0-32b242",
  "org.scalablytyped.japgolly" %%% "sentry__hub" % "7.14.0-c9adf6",
  "org.scalablytyped.japgolly" %%% "sentry__types" % "7.15.0-dde70c",
  "org.scalablytyped.japgolly" %%% "sentry__utils" % "7.15.0-55490c",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
