organization := "org.gulliblytyped.japgolly"
name := "d3-contour"
version := "1.3-dt-20190205Z-894a88"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-array" % "2.0-dt-20190221Z-d1146f",
  "org.gulliblytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-9d5d9f",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        