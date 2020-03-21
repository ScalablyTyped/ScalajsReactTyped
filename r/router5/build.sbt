organization := "org.scalablytyped.japgolly"
name := "router5"
version := "7.0.2-a534b5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "path-parser" % "4.2.0-9557d6",
  "org.scalablytyped.japgolly" %%% "route-node" % "3.4.2-49c412",
  "org.scalablytyped.japgolly" %%% "router5-transition-path" % "7.0.1-0f7c15",
  "org.scalablytyped.japgolly" %%% "search-params" % "2.1.3-490e01",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
