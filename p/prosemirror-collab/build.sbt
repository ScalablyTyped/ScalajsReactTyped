organization := "org.scalablytyped.japgolly"
name := "prosemirror-collab"
version := "1.0-dt-20180504Z-1e93ee"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "orderedmap" % "1.0-dt-20180214Z-21fb21",
  "org.scalablytyped.japgolly" %%% "prosemirror-model" % "1.7-dt-20190628Z-3c0543",
  "org.scalablytyped.japgolly" %%% "prosemirror-state" % "1.2-dt-20200225Z-7f1fc2",
  "org.scalablytyped.japgolly" %%% "prosemirror-transform" % "1.1-dt-20191101Z-c9b033",
  "org.scalablytyped.japgolly" %%% "prosemirror-view" % "1.11-dt-20190930Z-2c3ca5",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
