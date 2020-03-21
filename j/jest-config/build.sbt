organization := "org.scalablytyped.japgolly"
name := "jest-config"
version := "24.9.0-95d0f5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-5f2b0c",
  "org.scalablytyped.japgolly" %%% "jest-validate" % "25.1.0-2ad587",
  "org.scalablytyped.japgolly" %%% "jest__types" % "24.9.0-d73f5b",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "yargs" % "15.0-dt-20200225Z-3327e6",
  "org.scalablytyped.japgolly" %%% "yargs-parser" % "15.0-dt-20200113Z-9677bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
