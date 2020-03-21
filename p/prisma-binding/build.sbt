organization := "org.scalablytyped.japgolly"
name := "prisma-binding"
version := "2.3.16-0ef074"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "apollo-link" % "1.2.13-f13d38",
  "org.scalablytyped.japgolly" %%% "ava" % "2.4.0-c15609",
  "org.scalablytyped.japgolly" %%% "graphql" % "14.6.0-e3aedb",
  "org.scalablytyped.japgolly" %%% "graphql-binding" % "2.5.2-c29574",
  "org.scalablytyped.japgolly" %%% "graphql-tools" % "4.0.6-7f0801",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "zen-observable-ts" % "0.8.20-bd524b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
