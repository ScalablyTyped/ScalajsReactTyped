organization := "org.scalablytyped.japgolly"
name := "jimp__types"
version := "0.8.5-979800"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "jimp__bmp" % "0.8.5-0a4599",
  "org.scalablytyped.japgolly" %%% "jimp__core" % "0.8.5-f7c0b8",
  "org.scalablytyped.japgolly" %%% "jimp__gif" % "0.8.5-3ed82b",
  "org.scalablytyped.japgolly" %%% "jimp__jpeg" % "0.8.5-107d2a",
  "org.scalablytyped.japgolly" %%% "jimp__png" % "0.8.5-d4b1d2",
  "org.scalablytyped.japgolly" %%% "jimp__tiff" % "0.8.5-7f9d97",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
