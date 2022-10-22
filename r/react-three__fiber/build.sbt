organization := "org.scalablytyped.japgolly"
name := "react-three__fiber"
version := "8.7.4-f4bcf7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "immer" % "9.0.15-d9323e",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-native" % "0.70-dt-20221016Z-fcd88f",
  "org.scalablytyped.japgolly" %%% "react-reconciler" % "0.28-dt-20220624Z-52ff25",
  "org.scalablytyped.japgolly" %%% "react-use-measure" % "2.1.1-9715c5",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "three" % "0.144-dt-20220902Z-0d26e6",
  "org.scalablytyped.japgolly" %%% "webxr" % "0.5-dt-20220721Z-685295",
  "org.scalablytyped.japgolly" %%% "zustand" % "4.1.1-4d447f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
