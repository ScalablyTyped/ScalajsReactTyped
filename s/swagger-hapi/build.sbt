organization := "org.scalablytyped.japgolly"
name := "swagger-hapi"
version := "0.7-dt-20211202Z-c7aa64"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "boom" % "7.3-dt-20220913Z-0e559c",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20211202Z-40b88d",
  "org.scalablytyped.japgolly" %%% "catbox" % "10.0-dt-20211202Z-6a25e4",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "formidable" % "2.0-dt-20220502Z-a6cef0",
  "org.scalablytyped.japgolly" %%% "hapi" % "18.0-dt-20220819Z-30b26d",
  "org.scalablytyped.japgolly" %%% "iron" % "5.0-dt-20211202Z-2c641a",
  "org.scalablytyped.japgolly" %%% "joi" % "17.6.3-89f02e",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "mime-db" % "1.43-dt-20211202Z-18cd1e",
  "org.scalablytyped.japgolly" %%% "mimos" % "3.0-dt-20211202Z-fdeaa7",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "podium" % "1.0-dt-20211202Z-9bf29f",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "restify" % "8.5-dt-20220810Z-e09e9d",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "shot" % "4.0-dt-20211202Z-6f3780",
  "org.scalablytyped.japgolly" %%% "spdy" % "3.4-dt-20211202Z-553442",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "swagger-node-runner" % "0.6-dt-20211202Z-7493b7",
  "org.scalablytyped.japgolly" %%% "swagger-schema-official" % "2.0-dt-20211202Z-883568")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
