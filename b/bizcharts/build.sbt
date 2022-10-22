organization := "org.scalablytyped.japgolly"
name := "bizcharts"
version := "4.1.20-c9ee9f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "antv__adjust" % "0.2.5-73134f",
  "org.scalablytyped.japgolly" %%% "antv__attr" % "0.3.3-a59abc",
  "org.scalablytyped.japgolly" %%% "antv__component" % "0.8.28-66db6c",
  "org.scalablytyped.japgolly" %%% "antv__coord" % "0.4.4-7c50ae",
  "org.scalablytyped.japgolly" %%% "antv__event-emitter" % "0.1.3-c14297",
  "org.scalablytyped.japgolly" %%% "antv__g-base" % "0.5.11-18926b",
  "org.scalablytyped.japgolly" %%% "antv__g-canvas" % "1.9.5-7fc603",
  "org.scalablytyped.japgolly" %%% "antv__g-lite" % "1.0.6-a57edd",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-0fb197",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-canvas-picker" % "1.8.14-e632d6",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-24c146",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-dom-interaction" % "1.7.17-71671f",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-html-renderer" % "1.7.17-ce9d24",
  "org.scalablytyped.japgolly" %%% "antv__g-plugin-image-loader" % "1.1.18-a100b4",
  "org.scalablytyped.japgolly" %%% "antv__g2" % "4.2.8-e5a618",
  "org.scalablytyped.japgolly" %%% "antv__g2plot" % "2.4.20-43e3f5",
  "org.scalablytyped.japgolly" %%% "antv__scale" % "0.4.11-089725",
  "org.scalablytyped.japgolly" %%% "antv__util" % "3.3.0-6bcbe7",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "3.0-dt-20211202Z-2ee647",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.7-a15150",
  "org.scalablytyped.japgolly" %%% "gl-matrix" % "3.4.3-a577e0",
  "org.scalablytyped.japgolly" %%% "inversify" % "6.0.1-a9a274",
  "org.scalablytyped.japgolly" %%% "mana-syringe" % "0.3.2-96c9ed",
  "org.scalablytyped.japgolly" %%% "offscreencanvas" % "2019.7-dt-20220526Z-509f29",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "rbush" % "3.0-dt-20220819Z-e26bd2",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-error-boundary" % "3.1.4-4efc0b",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
