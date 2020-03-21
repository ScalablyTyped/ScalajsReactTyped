organization := "org.scalablytyped.japgolly"
name := "samchon-framework"
version := "2.1.4-04a878"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ecol" % "1.1.0-392b85",
  "org.scalablytyped.japgolly" %%% "samchon" % "2.1.4-a23c37",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "sxml" % "1.0.3-cd1f52",
  "org.scalablytyped.japgolly" %%% "tstl" % "2.4.0-2f2a07",
  "org.scalablytyped.japgolly" %%% "url-variables" % "1.0.2-63422d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
