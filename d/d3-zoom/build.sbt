organization := "org.gulliblytyped.japgolly"
name := "d3-zoom"
version := "1.7-dt-20190212Z-52d91a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-color" % "1.2-dt-20190212Z-852063",
  "org.gulliblytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20190212Z-72e15d",
  "org.gulliblytyped.japgolly" %%% "d3-selection" % "1.4-dt-20190710Z-19adcf",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        