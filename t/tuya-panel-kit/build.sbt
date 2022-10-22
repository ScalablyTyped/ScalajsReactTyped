organization := "org.scalablytyped.japgolly"
name := "tuya-panel-kit"
version := "4.7-dt-20211202Z-78200a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "hammerjs" % "2.0.8-dt-20220819Z-7d2da2",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-native" % "0.70-dt-20221016Z-fcd88f",
  "org.scalablytyped.japgolly" %%% "react-native-gesture-handler" % "2.7.1-7e480b",
  "org.scalablytyped.japgolly" %%% "react-native-safe-area-context" % "4.3.4-ad9f65",
  "org.scalablytyped.japgolly" %%% "react-test-renderer" % "18.0-dt-20220805Z-be1047",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
