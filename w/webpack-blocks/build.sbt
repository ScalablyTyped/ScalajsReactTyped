organization := "org.scalablytyped.japgolly"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-1fd75a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "schema-utils" % "4.0.0-ecbca7",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tapable" % "2.2.1-6e9028",
  "org.scalablytyped.japgolly" %%% "uglify-js" % "3.17-dt-20220913Z-d03bf0",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5",
  "org.scalablytyped.japgolly" %%% "webpack" % "5.74.0-ca115e",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-fbb61b",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-930b3c",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-574dc6",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-02fb6c",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-d6ef23",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-b75b29",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-1a55a5",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-4ebcc6",
  "org.scalablytyped.japgolly" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-65866a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
