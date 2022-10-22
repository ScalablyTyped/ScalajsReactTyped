organization := "org.scalablytyped.japgolly"
name := "apollo-datasource"
version := "3.3.2-17b6a3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "apollo__utils_dot_keyvaluecache" % "1.0.1-620002",
  "org.scalablytyped.japgolly" %%% "apollo__utils_dot_logger" % "1.0.0-225c8e",
  "org.scalablytyped.japgolly" %%% "lru-cache" % "7.14.0-9f5d78",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
