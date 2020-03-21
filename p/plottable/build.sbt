organization := "org.scalablytyped.japgolly"
name := "plottable"
version := "3.8.6-a7dcf2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "d3-collection" % "1.0-dt-20200225Z-5d2d4a",
  "org.scalablytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-092880",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "1.4-dt-20200225Z-910fbf",
  "org.scalablytyped.japgolly" %%% "d3-shape" % "1.3-dt-20200225Z-c38cef",
  "org.scalablytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-624fa0",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "1.1-dt-20200225Z-866f7e",
  "org.scalablytyped.japgolly" %%% "lodash" % "4.14-dt-20200302Z-431400",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "typesettable" % "4.1.0-e36ea7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
