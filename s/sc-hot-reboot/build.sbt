organization := "org.scalablytyped.japgolly"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-a43265"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "async" % "3.0-dt-20200225Z-3508f7",
  "org.scalablytyped.japgolly" %%% "async-iterable-stream" % "3.0-dt-20200205Z-21686c",
  "org.scalablytyped.japgolly" %%% "chokidar" % "3.3.1-5b0ac8",
  "org.scalablytyped.japgolly" %%% "consumable-stream" % "1.0-dt-20200205Z-f08d81",
  "org.scalablytyped.japgolly" %%% "expirymanager" % "0.9-dt-20181130Z-4135d4",
  "org.scalablytyped.japgolly" %%% "fleximap" % "0.9-dt-20181205Z-dcc977",
  "org.scalablytyped.japgolly" %%% "jsonwebtoken" % "8.3-dt-20200228Z-32b0f3",
  "org.scalablytyped.japgolly" %%% "ncom" % "1.0-dt-20200205Z-0f8a26",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "sc-auth" % "5.0-dt-20181130Z-4a5492",
  "org.scalablytyped.japgolly" %%% "sc-broker" % "8.0-dt-20200205Z-df1f5b",
  "org.scalablytyped.japgolly" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-7a31cf",
  "org.scalablytyped.japgolly" %%% "sc-channel" % "2.0-dt-20200205Z-00a747",
  "org.scalablytyped.japgolly" %%% "socketcluster" % "14.0-dt-20200205Z-ab44e2",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "stream-demux" % "7.0-dt-20200205Z-e1d41d",
  "org.scalablytyped.japgolly" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-d1380c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
