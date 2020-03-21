organization := "org.scalablytyped.japgolly"
name := "dagre-d3"
version := "0.4-dt-20200226Z-82441f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "1.4-dt-20200225Z-910fbf",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "1.1-dt-20200225Z-866f7e",
  "org.scalablytyped.japgolly" %%% "dagre" % "0.7-dt-20200226Z-af5444",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
