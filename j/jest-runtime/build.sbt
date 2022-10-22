organization := "org.scalablytyped.japgolly"
name := "jest-runtime"
version := "29.2.0-294819"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "callsites" % "4.0.0-5db007",
  "org.scalablytyped.japgolly" %%% "collect-v8-coverage" % "1.0.1-2931fd",
  "org.scalablytyped.japgolly" %%% "expect" % "29.2.0-d439d9",
  "org.scalablytyped.japgolly" %%% "graceful-fs" % "4.1-dt-20211202Z-fa8869",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-59a441",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-4ab34b",
  "org.scalablytyped.japgolly" %%% "istanbul-reports" % "3.0-dt-20211202Z-2c0222",
  "org.scalablytyped.japgolly" %%% "jest-diff" % "29.2.0-b60f93",
  "org.scalablytyped.japgolly" %%% "jest-haste-map" % "29.2.0-83e8ce",
  "org.scalablytyped.japgolly" %%% "jest-matcher-utils" % "29.2.0-331d47",
  "org.scalablytyped.japgolly" %%% "jest-message-util" % "29.2.0-d07bfc",
  "org.scalablytyped.japgolly" %%% "jest-mock" % "29.2.0-8e5ee0",
  "org.scalablytyped.japgolly" %%% "jest-resolve" % "29.2.0-0d693c",
  "org.scalablytyped.japgolly" %%% "jest-snapshot" % "29.2.0-75e2dc",
  "org.scalablytyped.japgolly" %%% "jest__console" % "29.2.0-e4f0b3",
  "org.scalablytyped.japgolly" %%% "jest__environment" % "29.2.0-233214",
  "org.scalablytyped.japgolly" %%% "jest__expect" % "29.2.0-4da697",
  "org.scalablytyped.japgolly" %%% "jest__expect-utils" % "29.2.0-933f66",
  "org.scalablytyped.japgolly" %%% "jest__fake-timers" % "29.2.0-91f147",
  "org.scalablytyped.japgolly" %%% "jest__schemas" % "29.0.0-3cabfb",
  "org.scalablytyped.japgolly" %%% "jest__source-map" % "29.2.0-4d0c33",
  "org.scalablytyped.japgolly" %%% "jest__test-result" % "29.2.0-f67fbe",
  "org.scalablytyped.japgolly" %%% "jest__transform" % "29.2.0-c52f0e",
  "org.scalablytyped.japgolly" %%% "jest__types" % "29.2.0-b8d122",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pretty-format" % "29.2.0-dde28b",
  "org.scalablytyped.japgolly" %%% "sinclair__typebox" % "0.24.42-a97bd0",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "2.0-dt-20211202Z-fd9cdc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
