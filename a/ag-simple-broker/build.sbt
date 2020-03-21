organization := "org.scalablytyped.japgolly"
name := "ag-simple-broker"
version := "4.0-dt-20200205Z-7e5073"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ag-channel" % "4.0-dt-20200205Z-f6d54c",
  "org.scalablytyped.japgolly" %%% "async-stream-emitter" % "3.0-dt-20200205Z-9ca189",
  "org.scalablytyped.japgolly" %%% "consumable-stream" % "1.0-dt-20200205Z-f08d81",
  "org.scalablytyped.japgolly" %%% "jsonwebtoken" % "8.3-dt-20200228Z-32b0f3",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "sc-auth" % "5.0-dt-20181130Z-4a5492",
  "org.scalablytyped.japgolly" %%% "sc-errors" % "1.4-dt-20200205Z-e3686c",
  "org.scalablytyped.japgolly" %%% "socketcluster-server" % "15.0-dt-20200214Z-1baa07",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "stream-demux" % "7.0-dt-20200205Z-e1d41d",
  "org.scalablytyped.japgolly" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-d1380c",
  "org.scalablytyped.japgolly" %%% "ws" % "7.2-dt-20200227Z-0c2dec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
