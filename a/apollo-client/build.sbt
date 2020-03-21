organization := "org.scalablytyped.japgolly"
name := "apollo-client"
version := "2.6.8-96ed45"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "apollo-cache" % "1.3.4-564825",
  "org.scalablytyped.japgolly" %%% "apollo-link" % "1.2.13-f13d38",
  "org.scalablytyped.japgolly" %%% "apollo-utilities" % "1.3.2-197918",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "zen-observable" % "0.8-dt-20200225Z-0527ca",
  "org.scalablytyped.japgolly" %%% "zen-observable-ts" % "0.8.20-bd524b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
