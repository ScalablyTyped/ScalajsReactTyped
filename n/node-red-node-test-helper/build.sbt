organization := "org.scalablytyped.japgolly"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-2b4217"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ace" % "0.0-unknown-dt-20220818Z-bcd0ab",
  "org.scalablytyped.japgolly" %%% "cookiejar" % "2.1-dt-20211202Z-fb8afa",
  "org.scalablytyped.japgolly" %%% "cors" % "2.8-dt-20211202Z-10d8ea",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.5-dt-20220624Z-e18178",
  "org.scalablytyped.japgolly" %%% "jsonata" % "1.8.6-438e09",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-red" % "1.2-dt-20220329Z-32d905",
  "org.scalablytyped.japgolly" %%% "node-red__editor-api" % "1.1-dt-20211202Z-00a910",
  "org.scalablytyped.japgolly" %%% "node-red__editor-client" % "1.1-dt-20220914Z-41c2db",
  "org.scalablytyped.japgolly" %%% "node-red__registry" % "1.2-dt-20220912Z-8f93a4",
  "org.scalablytyped.japgolly" %%% "node-red__runtime" % "1.2-dt-20211202Z-93c394",
  "org.scalablytyped.japgolly" %%% "node-red__util" % "1.2-dt-20220624Z-db3050",
  "org.scalablytyped.japgolly" %%% "passport" % "1.0-dt-20220912Z-e7c2f0",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "sinon" % "10.0-dt-20220720Z-30f991",
  "org.scalablytyped.japgolly" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-f8d735",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "superagent" % "4.1-dt-20220125Z-805e24",
  "org.scalablytyped.japgolly" %%% "supertest" % "v2.0.1-dt-20220818Z-aecc07")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
