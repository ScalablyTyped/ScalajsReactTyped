organization := "org.scalablytyped.japgolly"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-33d983"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bunyan" % "1.8-dt-20200226Z-ec4c1d",
  "org.scalablytyped.japgolly" %%% "formidable" % "1.0.16-dt-20200225Z-cf44e7",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "restify" % "8.4-dt-20200225Z-8f0faf",
  "org.scalablytyped.japgolly" %%% "spdy" % "3.4-dt-20200227Z-9e93db",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
