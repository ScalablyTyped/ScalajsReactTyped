organization := "org.scalablytyped.japgolly"
name := "handsontable"
version := "12.1.3-70178c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "chevrotain" % "10.3.0-866bbf",
  "org.scalablytyped.japgolly" %%% "chevrotain__types" % "10.3.0-f27cd5",
  "org.scalablytyped.japgolly" %%% "hyperformula" % "2.1.0-958b0b",
  "org.scalablytyped.japgolly" %%% "moment" % "2.29.4-49fb6c",
  "org.scalablytyped.japgolly" %%% "numbro" % "2.3.6-15a6e7",
  "org.scalablytyped.japgolly" %%% "pikaday" % "1.7-dt-20220704Z-e60a47",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tiny-emitter" % "2.1.0-e3635e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
