organization := "org.scalablytyped.japgolly"
name := "rc-tree-select"
version := "5.5.0-884b68"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "rc-motion" % "2.6.2-bc92e1",
  "org.scalablytyped.japgolly" %%% "rc-select" % "14.1.13-a3235d",
  "org.scalablytyped.japgolly" %%% "rc-tree" % "5.7.0-488636",
  "org.scalablytyped.japgolly" %%% "rc-trigger" % "5.3.1-954195",
  "org.scalablytyped.japgolly" %%% "rc-virtual-list" % "3.4.8-e60a6f",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
