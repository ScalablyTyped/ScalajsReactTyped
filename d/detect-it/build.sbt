organization := "org.scalablytyped.japgolly"
name := "detect-it"
version := "2.1-dt-20180214Z-b2f700"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "detect-hover" % "1.0-dt-20180214Z-800787",
  "org.scalablytyped.japgolly" %%% "detect-passive-events" % "1.0-dt-20180214Z-883d7f",
  "org.scalablytyped.japgolly" %%% "detect-pointer" % "1.0-dt-20180214Z-0c450d",
  "org.scalablytyped.japgolly" %%% "detect-touch-events" % "1.0-dt-20180214Z-62485e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
