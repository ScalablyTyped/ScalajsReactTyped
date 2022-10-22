organization := "org.scalablytyped.japgolly"
name := "customize-cra"
version := "1.0-dt-20220815Z-267ff3"
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
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e",
  "org.scalablytyped.japgolly" %%% "webpack-bundle-analyzer" % "4.6-dt-20221005Z-6d036d",
  "org.scalablytyped.japgolly" %%% "workbox-webpack-plugin" % "5.1-dt-20211202Z-c92546")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
