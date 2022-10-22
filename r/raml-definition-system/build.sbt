organization := "org.scalablytyped.japgolly"
name := "raml-definition-system"
version := "0.0.94-e3510e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "raml-json-validation" % "0.0.18-73a583",
  "org.scalablytyped.japgolly" %%% "raml-typesystem" % "0.0.96-86778b",
  "org.scalablytyped.japgolly" %%% "raml-xml-validation" % "0.1.0-d7351e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "ts-structure-model" % "0.0.1-dcb58b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
