organization := "org.scalablytyped.japgolly"
name := "passport_dot_socketio"
version := "3.7-dt-20211223Z-67751e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cors" % "2.8-dt-20211202Z-10d8ea",
  "org.scalablytyped.japgolly" %%% "engine_dot_io" % "6.2.0-483c78",
  "org.scalablytyped.japgolly" %%% "engine_dot_io-parser" % "5.0.4-0b66bc",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "express-session" % "1.17-dt-20220707Z-f0c1f0",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "passport" % "1.0-dt-20220912Z-e7c2f0",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "socket_dot_io" % "4.5.3-1659e0",
  "org.scalablytyped.japgolly" %%% "socket_dot_io-adapter" % "2.4.0-6e49f0",
  "org.scalablytyped.japgolly" %%% "socket_dot_io-parser" % "4.2.1-4a28f3",
  "org.scalablytyped.japgolly" %%% "socket_dot_io__component-emitter" % "3.1.0-61c6c4",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
