organization := "org.scalablytyped.japgolly"
name := "apollo-cache-control"
version := "0.8.11-c40c3c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "apollo-engine-reporting-protobuf" % "0.4.4-1f6fd1",
  "org.scalablytyped.japgolly" %%% "apollo-server-caching" % "0.5.1-879eab",
  "org.scalablytyped.japgolly" %%% "apollo-server-env" % "2.4.3-7e3f25",
  "org.scalablytyped.japgolly" %%% "apollo-server-types" % "0.2.10-4b900d",
  "org.scalablytyped.japgolly" %%% "apollo__protobufjs" % "1.0.3-47da9f",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "graphql-extensions" % "0.10.10-bee541",
  "org.scalablytyped.japgolly" %%% "long" % "4.0.0-dt-20200226Z-4709c2",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
