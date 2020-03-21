organization := "org.scalablytyped.japgolly"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20190726Z-0fdac0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "pollyjs__adapter" % "3.0-dt-20200225Z-f541b4",
  "org.scalablytyped.japgolly" %%% "pollyjs__core" % "4.0-dt-20200125Z-c80288",
  "org.scalablytyped.japgolly" %%% "pollyjs__persister" % "2.0-dt-20200225Z-908c11",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
