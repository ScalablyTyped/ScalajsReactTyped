organization := "org.scalablytyped.japgolly"
name := "wix-ui-test-utils"
version := "1.0.191-ab4162"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "blocking-proxy" % "1.0.1-e7853c",
  "org.scalablytyped.japgolly" %%% "csstype" % "3.1.1-6f6894",
  "org.scalablytyped.japgolly" %%% "enzyme" % "3.10-dt-20220818Z-335cd9",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20220407Z-2e1de8",
  "org.scalablytyped.japgolly" %%% "protractor" % "7.0.0-e0c521",
  "org.scalablytyped.japgolly" %%% "q" % "1.5-dt-20220819Z-c894ec",
  "org.scalablytyped.japgolly" %%% "react" % "18.0-dt-20220922Z-c9da7d",
  "org.scalablytyped.japgolly" %%% "react-dom" % "18.0-dt-20220819Z-74fd4f",
  "org.scalablytyped.japgolly" %%% "scheduler" % "0.16-dt-20211202Z-ea969a",
  "org.scalablytyped.japgolly" %%% "selenium-webdriver" % "4.1-dt-20220909Z-ba92c6",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "unidriver__core" % "1.3.0-4ee259",
  "org.scalablytyped.japgolly" %%% "unidriver__jsdom-react" % "1.7.0-cf4691",
  "org.scalablytyped.japgolly" %%% "webdriver-js-extender" % "2.2.0-2f1d42",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
