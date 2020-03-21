organization := "org.scalablytyped.japgolly"
name := "apollo-link-ws"
version := "1.0.19-5ed246"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "apollo-link" % "1.2.13-f13d38",
  "org.scalablytyped.japgolly" %%% "eventemitter3" % "4.0.0-0d2eae",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "subscriptions-transport-ws" % "0.9.16-9743a5",
  "org.scalablytyped.japgolly" %%% "ws" % "7.2-dt-20200227Z-0c2dec",
  "org.scalablytyped.japgolly" %%% "zen-observable-ts" % "0.8.20-bd524b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
