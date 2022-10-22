organization := "org.scalablytyped.japgolly"
name := "redis-mock"
version := "0.17-dt-20211209Z-a5158c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "generic-pool" % "3.9.0-8d4c47",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "redis" % "4.3.1-a6268f",
  "org.scalablytyped.japgolly" %%% "redis__client" % "1.3.0-f185e7",
  "org.scalablytyped.japgolly" %%% "redis__search" % "1.1.0-41b2d5",
  "org.scalablytyped.japgolly" %%% "redis__time-series" % "1.0.3-afc133",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
