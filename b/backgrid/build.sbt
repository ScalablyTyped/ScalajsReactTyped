organization := "org.scalablytyped.japgolly"
name := "backgrid"
version := "0.2-dt-20200226Z-9b1eae"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "backbone" % "1.4-dt-20200225Z-9a0e7a",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.3-dt-20200225Z-1ffbf2",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20181006Z-7d1fc9",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "underscore" % "1.9-dt-20200225Z-5f2ec8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
