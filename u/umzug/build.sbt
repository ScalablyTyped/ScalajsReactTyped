organization := "org.scalablytyped.japgolly"
name := "umzug"
version := "v2.2.0-dt-20200227Z-07ab70"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20200302Z-b175b6",
  "org.scalablytyped.japgolly" %%% "bson" % "4.0-dt-20200225Z-3bc22a",
  "org.scalablytyped.japgolly" %%% "continuation-local-storage" % "3.2-dt-20200225Z-767846",
  "org.scalablytyped.japgolly" %%% "lodash" % "4.14-dt-20200302Z-431400",
  "org.scalablytyped.japgolly" %%% "mongodb" % "3.5-dt-20200302Z-b1f491",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "sequelize" % "4.28.0-dt-20200225Z-d1236b",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "validator" % "12.0-dt-20191226Z-90ee06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
