organization := "org.scalablytyped.japgolly"
name := "micromark-extension-mdx-jsx"
version := "1.0.3-bc82e2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "acorn" % "8.8.0-e10d9d",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "estree-util-visit" % "1.2.0-3bd66f",
  "org.scalablytyped.japgolly" %%% "micromark-factory-mdx-expression" % "1.0.6-6a0469",
  "org.scalablytyped.japgolly" %%% "micromark-util-events-to-acorn" % "1.2.0-6faeab",
  "org.scalablytyped.japgolly" %%% "micromark-util-types" % "1.0.2-3b0bd5",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unist" % "2.0-dt-20220624Z-db00de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
