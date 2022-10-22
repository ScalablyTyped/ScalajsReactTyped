organization := "org.scalablytyped.japgolly"
name := "nivo__heatmap"
version := "0.80.0-bfb772"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "d3-color" % "3.1-dt-20220522Z-ee6702",
  "org.scalablytyped.japgolly" %%% "d3-path" % "3.0-dt-20220310Z-c74868",
  "org.scalablytyped.japgolly" %%% "d3-scale" % "4.0-dt-20220624Z-718053",
  "org.scalablytyped.japgolly" %%% "d3-shape" % "3.1-dt-20220624Z-7b0e71",
  "org.scalablytyped.japgolly" %%% "d3-time" % "3.0-dt-20211202Z-0604bb",
  "org.scalablytyped.japgolly" %%% "nivo__annotations" % "0.80.0-eeeb5d",
  "org.scalablytyped.japgolly" %%% "nivo__axes" % "0.80.0-64bac1",
  "org.scalablytyped.japgolly" %%% "nivo__colors" % "0.80.0-471a85",
  "org.scalablytyped.japgolly" %%% "nivo__core" % "0.80.0-0ff29d",
  "org.scalablytyped.japgolly" %%% "nivo__legends" % "0.80.0-b2ff69",
  "org.scalablytyped.japgolly" %%% "nivo__scales" % "0.80.0-e2d9db",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-spring__types" % "9.5.5-cb71c6",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
