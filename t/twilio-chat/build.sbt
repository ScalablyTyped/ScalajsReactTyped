organization := "org.scalablytyped.japgolly"
name := "twilio-chat"
version := "3.3.4-381d69"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "loglevel" % "1.6.7-3faf22",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "twilio-mcs-client" % "0.3.3-474665",
  "org.scalablytyped.japgolly" %%% "twilio-notifications" % "0.5.8-8fb34f",
  "org.scalablytyped.japgolly" %%% "twilio-sync" % "0.11.5-40404e",
  "org.scalablytyped.japgolly" %%% "twilsock" % "0.5.11-01557a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
