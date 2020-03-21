organization := "org.scalablytyped.japgolly"
name := "electron-publish"
version := "21.2.0-49d6d5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "builder-util" % "21.2.0-8d4e31",
  "org.scalablytyped.japgolly" %%% "builder-util-runtime" % "8.3.0-cc711c",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20200226Z-3b294d",
  "org.scalablytyped.japgolly" %%% "fs-extra" % "8.1-dt-20200218Z-155af4",
  "org.scalablytyped.japgolly" %%% "lazy-val" % "1.0.4-916fd8",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "temp-file" % "3.3.4-c5c63d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
