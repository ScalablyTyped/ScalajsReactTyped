organization := "org.scalablytyped.japgolly"
name := "sc-channel"
version := "2.0-dt-20200205Z-00a747"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "async-iterable-stream" % "3.0-dt-20200205Z-21686c",
  "org.scalablytyped.japgolly" %%% "consumable-stream" % "1.0-dt-20200205Z-f08d81",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "stream-demux" % "7.0-dt-20200205Z-e1d41d",
  "org.scalablytyped.japgolly" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-d1380c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
