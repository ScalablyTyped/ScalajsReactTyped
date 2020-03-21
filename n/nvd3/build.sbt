organization := "org.scalablytyped.japgolly"
name := "nvd3"
version := "1.8.1-dt-20200225Z-b45d06"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20200225Z-a70e24",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "1.4-dt-20200225Z-910fbf",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "1.1-dt-20200225Z-866f7e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
