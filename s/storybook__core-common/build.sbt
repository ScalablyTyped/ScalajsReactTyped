organization := "org.scalablytyped.japgolly"
name := "storybook__core-common"
version := "6.5.12-b54f1a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "babel__core" % "7.1-dt-20220624Z-70ea58",
  "org.scalablytyped.japgolly" %%% "babel__generator" % "7.6-dt-20211223Z-d287e9",
  "org.scalablytyped.japgolly" %%% "babel__parser" % "7.19.4-03fc7e",
  "org.scalablytyped.japgolly" %%% "babel__template" % "7.4-dt-20211202Z-a6f3ab",
  "org.scalablytyped.japgolly" %%% "babel__traverse" % "7.18-dt-20220923Z-12cca0",
  "org.scalablytyped.japgolly" %%% "babel__types" % "7.19.4-3aab9c",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "events" % "3.0-dt-20211202Z-30431b",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-5b95db",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "node-abort-controller" % "3.0.1-459785",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
