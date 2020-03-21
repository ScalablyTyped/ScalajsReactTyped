organization := "org.scalablytyped.japgolly"
name := "mongodb-memory-server-core"
version := "6.2.4-45e6be"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bson" % "4.0-dt-20200225Z-3bc22a",
  "org.scalablytyped.japgolly" %%% "https-proxy-agent" % "2.2.2-10357d",
  "org.scalablytyped.japgolly" %%% "mongodb" % "3.5-dt-20200302Z-b1f491",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "tmp" % "0.1-dt-20200227Z-626da7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
