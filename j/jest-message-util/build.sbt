organization := "org.scalablytyped.japgolly"
name := "jest-message-util"
version := "24.9.0-22dc2e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "callsites" % "3.1.0-5156c7",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-5f2b0c",
  "org.scalablytyped.japgolly" %%% "jest__console" % "24.9.0-71080d",
  "org.scalablytyped.japgolly" %%% "jest__source-map" % "24.9.0-9448a1",
  "org.scalablytyped.japgolly" %%% "jest__test-result" % "24.9.0-ad1297",
  "org.scalablytyped.japgolly" %%% "jest__types" % "24.9.0-d73f5b",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "stack-utils" % "1.0-dt-20200225Z-34b927",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
