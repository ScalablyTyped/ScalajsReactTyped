organization := "org.scalablytyped.japgolly"
name := "cache-manager-ioredis"
version := "2.0-dt-20211202Z-4e0759"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cache-manager" % "5.0.1-54795a",
  "org.scalablytyped.japgolly" %%% "denque" % "2.1.0-d80850",
  "org.scalablytyped.japgolly" %%% "ioredis" % "5.2.3-bb0ce5",
  "org.scalablytyped.japgolly" %%% "lru-cache" % "7.14.0-9f5d78",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "redis-errors" % "1.2-dt-20211202Z-a99080",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
