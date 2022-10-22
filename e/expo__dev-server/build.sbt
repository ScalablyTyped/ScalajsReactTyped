organization := "org.scalablytyped.japgolly"
name := "expo__dev-server"
version := "0.1.120-e89cfd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "babel__code-frame" % "7.0-dt-20211202Z-685d32",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20220818Z-62b6dd",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "expo__bunyan" % "4.0.0-aa1cd9",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "metro" % "0.66-dt-20220106Z-402252",
  "org.scalablytyped.japgolly" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-d76d61",
  "org.scalablytyped.japgolly" %%% "metro-cache" % "0.66-dt-20211202Z-3aad5a",
  "org.scalablytyped.japgolly" %%% "metro-config" % "0.66-dt-20211202Z-76f221",
  "org.scalablytyped.japgolly" %%% "metro-core" % "0.66-dt-20211202Z-702baa",
  "org.scalablytyped.japgolly" %%% "metro-resolver" % "0.66-dt-20211202Z-f6a5d4",
  "org.scalablytyped.japgolly" %%% "metro-source-map" % "0.66-dt-20211202Z-d587a4",
  "org.scalablytyped.japgolly" %%% "metro-transform-worker" % "0.66-dt-20211202Z-b7f9e1",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
