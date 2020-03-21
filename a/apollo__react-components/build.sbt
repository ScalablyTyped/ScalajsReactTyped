organization := "org.scalablytyped.japgolly"
name := "apollo__react-components"
version := "3.1.3-0b32c6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "apollo-cache" % "1.3.4-564825",
  "org.scalablytyped.japgolly" %%% "apollo-client" % "2.6.8-96ed45",
  "org.scalablytyped.japgolly" %%% "apollo-link" % "1.2.13-f13d38",
  "org.scalablytyped.japgolly" %%% "apollo-utilities" % "1.3.2-197918",
  "org.scalablytyped.japgolly" %%% "apollo__react-common" % "3.1.3-815eb6",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "zen-observable" % "0.8-dt-20200225Z-0527ca",
  "org.scalablytyped.japgolly" %%% "zen-observable-ts" % "0.8.20-bd524b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
