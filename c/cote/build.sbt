organization := "org.scalablytyped.japgolly"
name := "cote"
version := "0.19-dt-20211202Z-088137"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cors" % "2.8-dt-20211202Z-10d8ea",
  "org.scalablytyped.japgolly" %%% "engine_dot_io" % "6.2.0-483c78",
  "org.scalablytyped.japgolly" %%% "engine_dot_io-parser" % "5.0.4-0b66bc",
  "org.scalablytyped.japgolly" %%% "eventemitter2" % "6.4.9-3b8498",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "socket_dot_io" % "4.5.3-1659e0",
  "org.scalablytyped.japgolly" %%% "socket_dot_io-adapter" % "2.4.0-6e49f0",
  "org.scalablytyped.japgolly" %%% "socket_dot_io-parser" % "4.2.1-4a28f3",
  "org.scalablytyped.japgolly" %%% "socket_dot_io__component-emitter" % "3.1.0-61c6c4",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
