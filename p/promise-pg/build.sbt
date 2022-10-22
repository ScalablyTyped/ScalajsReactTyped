organization := "org.scalablytyped.japgolly"
name := "promise-pg"
version := "0.0-unknown-dt-20220818Z-17f429"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pg" % "8.6-dt-20220307Z-4ef078",
  "org.scalablytyped.japgolly" %%% "pg-protocol" % "1.5.0-819d0a",
  "org.scalablytyped.japgolly" %%% "pg-types" % "4.0.0-b9c825",
  "org.scalablytyped.japgolly" %%% "q" % "1.5-dt-20220819Z-c894ec",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
