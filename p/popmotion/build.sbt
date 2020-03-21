organization := "org.scalablytyped.japgolly"
name := "popmotion"
version := "8.7.1-c000dd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "framesync" % "4.0.4-fdcb2d",
  "org.scalablytyped.japgolly" %%% "popmotion__easing" % "1.0.2-18cc67",
  "org.scalablytyped.japgolly" %%% "popmotion__popcorn" % "0.4.4-e4ae3a",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "style-value-types" % "3.1.7-06c975",
  "org.scalablytyped.japgolly" %%% "stylefire" % "7.0.1-4574ed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
