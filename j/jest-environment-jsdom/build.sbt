organization := "org.scalablytyped.japgolly"
name := "jest-environment-jsdom"
version := "24.9.0-47d42a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "callsites" % "3.1.0-5156c7",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-5f2b0c",
  "org.scalablytyped.japgolly" %%% "jest-message-util" % "24.9.0-22dc2e",
  "org.scalablytyped.japgolly" %%% "jest-mock" % "24.9.0-853cb1",
  "org.scalablytyped.japgolly" %%% "jest__console" % "24.9.0-71080d",
  "org.scalablytyped.japgolly" %%% "jest__environment" % "24.9.0-9040d2",
  "org.scalablytyped.japgolly" %%% "jest__fake-timers" % "24.9.0-234b6d",
  "org.scalablytyped.japgolly" %%% "jest__source-map" % "24.9.0-9448a1",
  "org.scalablytyped.japgolly" %%% "jest__test-result" % "24.9.0-ad1297",
  "org.scalablytyped.japgolly" %%% "jest__types" % "24.9.0-d73f5b",
  "org.scalablytyped.japgolly" %%% "jsdom" % "16.1-dt-20200225Z-d776a3",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "parse5" % "5.0-dt-20200225Z-ff8901",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "1.0-dt-20200225Z-34b927",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "2.3-dt-20191206Z-d45a45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
