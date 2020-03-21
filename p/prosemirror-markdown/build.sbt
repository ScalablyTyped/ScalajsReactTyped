organization := "org.scalablytyped.japgolly"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-d385fc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "linkify-it" % "2.1.0-dt-20200225Z-c38211",
  "org.scalablytyped.japgolly" %%% "markdown-it" % "0.0-unknown-dt-20200226Z-71bae4",
  "org.scalablytyped.japgolly" %%% "orderedmap" % "1.0-dt-20180214Z-21fb21",
  "org.scalablytyped.japgolly" %%% "prosemirror-model" % "1.7-dt-20190628Z-3c0543",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
