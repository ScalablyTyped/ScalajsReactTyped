organization := "org.scalablytyped.japgolly"
name := "jss-preset-default"
version := "10.9.2-9a73ca"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "jss" % "10.9.2-8ccb97",
  "org.scalablytyped.japgolly" %%% "jss-plugin-default-unit" % "10.9.2-315fe3",
  "org.scalablytyped.japgolly" %%% "jss-plugin-rule-value-observable" % "10.9.2-1db9cc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
