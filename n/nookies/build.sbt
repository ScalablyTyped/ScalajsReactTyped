organization := "org.scalablytyped.japgolly"
name := "nookies"
version := "2.5.2-972f07"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "cookie" % "0.5-dt-20220420Z-5d8fef",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "lodash" % "4.14-dt-20220928Z-eb2108",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "next" % "12.3.1-98d043",
  "org.scalablytyped.japgolly" %%% "next__env" % "12.3.1-c786db",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "postcss" % "8.4.18-e06f87",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "set-cookie-parser" % "2.4-dt-20211223Z-f3a9b0",
  "org.scalablytyped.japgolly" %%% "source-map-js" % "1.0.2-971b9b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "swc__core" % "1.3.2-1ea82f",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "trusted-types" % "2.0-dt-20220624Z-804b84",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
