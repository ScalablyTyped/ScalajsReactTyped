organization := "org.scalablytyped.japgolly"
name := "vega-embed"
version := "6.21.0-8a9f12"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "estree" % "1.0-dt-20220712Z-3bfa6e",
  "org.scalablytyped.japgolly" %%% "fast-json-patch" % "3.1.1-7f0c45",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "vega" % "5.22.1-78a416",
  "org.scalablytyped.japgolly" %%% "vega-expression" % "5.0.0-b001cf",
  "org.scalablytyped.japgolly" %%% "vega-lite" % "5.6.0-da87bd",
  "org.scalablytyped.japgolly" %%% "vega-tooltip" % "0.28.0-6126ac",
  "org.scalablytyped.japgolly" %%% "vega-typings" % "0.22.3-8667c2",
  "org.scalablytyped.japgolly" %%% "vega-util" % "1.17.0-110787")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
