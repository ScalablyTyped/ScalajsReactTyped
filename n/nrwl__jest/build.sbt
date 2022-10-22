organization := "org.scalablytyped.japgolly"
name := "nrwl__jest"
version := "14.7.8-b5629a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "angular-devkit__core" % "14.2.3-c5d746",
  "org.scalablytyped.japgolly" %%% "angular-devkit__schematics" % "14.2.3-0bd34c",
  "org.scalablytyped.japgolly" %%% "collect-v8-coverage" % "1.0.1-2931fd",
  "org.scalablytyped.japgolly" %%% "graceful-fs" % "4.1-dt-20211202Z-fa8869",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-59a441",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-4ab34b",
  "org.scalablytyped.japgolly" %%% "istanbul-reports" % "3.0-dt-20211202Z-2c0222",
  "org.scalablytyped.japgolly" %%% "jest-haste-map" % "29.2.0-83e8ce",
  "org.scalablytyped.japgolly" %%% "jest-message-util" % "29.2.0-d07bfc",
  "org.scalablytyped.japgolly" %%% "jest-resolve" % "29.2.0-0d693c",
  "org.scalablytyped.japgolly" %%% "jest__console" % "29.2.0-e4f0b3",
  "org.scalablytyped.japgolly" %%% "jest__schemas" % "29.0.0-3cabfb",
  "org.scalablytyped.japgolly" %%% "jest__test-result" % "29.2.0-f67fbe",
  "org.scalablytyped.japgolly" %%% "jest__types" % "29.2.0-b8d122",
  "org.scalablytyped.japgolly" %%% "jsonc-parser" % "3.2.0-b0d53a",
  "org.scalablytyped.japgolly" %%% "magic-string" % "0.26.7-a42afe",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "rxjs" % "7.5.7-c83f26",
  "org.scalablytyped.japgolly" %%% "sinclair__typebox" % "0.24.42-a97bd0",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "2.0-dt-20211202Z-fd9cdc",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
