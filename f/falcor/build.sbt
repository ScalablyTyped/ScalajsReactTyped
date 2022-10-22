organization := "org.scalablytyped.japgolly"
name := "falcor"
version := "2.0-dt-20211202Z-5016ef"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "falcor-http-datasource" % "0.1.3-dt-20220818Z-e459fd",
  "org.scalablytyped.japgolly" %%% "falcor-json-graph" % "1.1.7-dt-20220913Z-f7c906",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
