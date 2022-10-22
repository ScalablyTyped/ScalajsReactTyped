organization := "org.scalablytyped.japgolly"
name := "swc-node__register"
version := "1.5.1-bf0b22"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "swc-node__core" % "1.9.0-b6fbd8",
  "org.scalablytyped.japgolly" %%% "swc__core" % "1.3.2-1ea82f",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
