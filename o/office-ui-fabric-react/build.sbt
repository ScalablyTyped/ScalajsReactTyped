organization := "org.scalablytyped.japgolly"
name := "office-ui-fabric-react"
version := "7.199.4-d14b38"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "enzyme" % "3.10-dt-20220818Z-335cd9",
  "org.scalablytyped.japgolly" %%% "fluentui__date-time-utilities" % "8.5.2-8b64bf",
  "org.scalablytyped.japgolly" %%% "fluentui__dom-utilities" % "2.2.2-bfe8a5",
  "org.scalablytyped.japgolly" %%% "fluentui__merge-styles" % "8.5.3-9d7dbb",
  "org.scalablytyped.japgolly" %%% "fluentui__react-focus" % "8.8.6-c6a731",
  "org.scalablytyped.japgolly" %%% "fluentui__react-window-provider" % "2.2.2-1e5674",
  "org.scalablytyped.japgolly" %%% "fluentui__theme" % "2.6.16-8f96df",
  "org.scalablytyped.japgolly" %%% "fluentui__utilities" % "8.13.1-ffa2a3",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-dom" % "18.0-dt-20220819Z-74fd4f",
  "org.scalablytyped.japgolly" %%% "react-test-renderer" % "18.0-dt-20220805Z-be1047",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "sinon" % "10.0-dt-20220720Z-30f991",
  "org.scalablytyped.japgolly" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-f8d735",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "uifabric__foundation" % "7.10.15-d4ee6d",
  "org.scalablytyped.japgolly" %%% "uifabric__icons" % "7.9.4-606bd4",
  "org.scalablytyped.japgolly" %%% "uifabric__merge-styles" % "7.20.1-865a63",
  "org.scalablytyped.japgolly" %%% "uifabric__react-hooks" % "7.16.3-12f623",
  "org.scalablytyped.japgolly" %%% "uifabric__styling" % "7.25.0-23cef6",
  "org.scalablytyped.japgolly" %%% "uifabric__utilities" % "7.38.1-0a8c4e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
