organization := "org.scalablytyped.japgolly"
name := "jest-cli"
version := "24.9.0-29abca"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "anymatch" % "1.3-dt-20190212Z-ec06c4",
  "org.scalablytyped.japgolly" %%% "callsites" % "3.1.0-5156c7",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-5f2b0c",
  "org.scalablytyped.japgolly" %%% "jest-changed-files" % "24.9.0-3ee21b",
  "org.scalablytyped.japgolly" %%% "jest-haste-map" % "24.9.0-dd3306",
  "org.scalablytyped.japgolly" %%% "jest-message-util" % "24.9.0-22dc2e",
  "org.scalablytyped.japgolly" %%% "jest-mock" % "24.9.0-853cb1",
  "org.scalablytyped.japgolly" %%% "jest-resolve" % "24.9.0-d2acc2",
  "org.scalablytyped.japgolly" %%% "jest-runner" % "24.9.0-2c6c9e",
  "org.scalablytyped.japgolly" %%% "jest-runtime" % "24.9.0-e37885",
  "org.scalablytyped.japgolly" %%% "jest__console" % "24.9.0-71080d",
  "org.scalablytyped.japgolly" %%% "jest__core" % "24.9.0-db6f30",
  "org.scalablytyped.japgolly" %%% "jest__environment" % "24.9.0-9040d2",
  "org.scalablytyped.japgolly" %%% "jest__fake-timers" % "24.9.0-234b6d",
  "org.scalablytyped.japgolly" %%% "jest__reporters" % "24.9.0-3331e3",
  "org.scalablytyped.japgolly" %%% "jest__source-map" % "24.9.0-9448a1",
  "org.scalablytyped.japgolly" %%% "jest__test-result" % "24.9.0-ad1297",
  "org.scalablytyped.japgolly" %%% "jest__types" % "24.9.0-d73f5b",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "prompts" % "2.0-dt-20191106Z-79132e",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "1.0-dt-20200225Z-34b927",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "yargs" % "15.0-dt-20200225Z-3327e6",
  "org.scalablytyped.japgolly" %%% "yargs-parser" % "15.0-dt-20200113Z-9677bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
