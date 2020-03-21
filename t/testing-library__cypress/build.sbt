organization := "org.scalablytyped.japgolly"
name := "testing-library__cypress"
version := "5.0-dt-20200203Z-6aa29b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "cypress" % "3.8.3-bdff64",
  "org.scalablytyped.japgolly" %%% "eventemitter2" % "5.0.1-4c5908",
  "org.scalablytyped.japgolly" %%% "moment" % "2.24.0-8e4e98",
  "org.scalablytyped.japgolly" %%% "pretty-format" % "24.9.0-47ff69",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "testing-library__dom" % "6.12-dt-20200210Z-f8b538")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
