organization := "org.gulliblytyped.japgolly"
name := "d3"
version := "5.7-dt-20190819Z-97674b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-array" % "2.0-dt-20190221Z-6c496c",
  "org.gulliblytyped.japgolly" %%% "d3-axis" % "1.0-dt-20190212Z-de9811",
  "org.gulliblytyped.japgolly" %%% "d3-brush" % "1.0-dt-20190212Z-470a28",
  "org.gulliblytyped.japgolly" %%% "d3-chord" % "1.0-dt-20190212Z-5c4d2b",
  "org.gulliblytyped.japgolly" %%% "d3-collection" % "1.0-dt-20190212Z-1becb6",
  "org.gulliblytyped.japgolly" %%% "d3-color" % "1.2-dt-20190212Z-852063",
  "org.gulliblytyped.japgolly" %%% "d3-contour" % "1.3-dt-20190205Z-81aefc",
  "org.gulliblytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20190212Z-f0f9c0",
  "org.gulliblytyped.japgolly" %%% "d3-drag" % "1.2-dt-20190212Z-9a5cb2",
  "org.gulliblytyped.japgolly" %%% "d3-dsv" % "1.0-dt-20190326Z-e4716b",
  "org.gulliblytyped.japgolly" %%% "d3-ease" % "1.0-dt-20191014Z-fa5a92",
  "org.gulliblytyped.japgolly" %%% "d3-force" % "1.2-dt-20190212Z-6ae5b6",
  "org.gulliblytyped.japgolly" %%% "d3-format" % "1.3-dt-20190212Z-9c9940",
  "org.gulliblytyped.japgolly" %%% "d3-geo" % "1.11-dt-20190212Z-a6d0f7",
  "org.gulliblytyped.japgolly" %%% "d3-hierarchy" % "1.1-dt-20190212Z-6f96a6",
  "org.gulliblytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20190212Z-72e15d",
  "org.gulliblytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-0d2123",
  "org.gulliblytyped.japgolly" %%% "d3-quadtree" % "1.0-dt-20190212Z-8abbe3",
  "org.gulliblytyped.japgolly" %%% "d3-random" % "1.1-dt-20190212Z-7e6668",
  "org.gulliblytyped.japgolly" %%% "d3-scale" % "2.1-dt-20190212Z-687aa3",
  "org.gulliblytyped.japgolly" %%% "d3-selection" % "1.4-dt-20190710Z-19adcf",
  "org.gulliblytyped.japgolly" %%% "d3-shape" % "1.3-dt-20191014Z-4ba9f5",
  "org.gulliblytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-27c11c",
  "org.gulliblytyped.japgolly" %%% "d3-time-format" % "2.1-dt-20190212Z-061ba0",
  "org.gulliblytyped.japgolly" %%% "d3-timer" % "1.0-dt-20190212Z-7ec633",
  "org.gulliblytyped.japgolly" %%% "d3-transition" % "1.1-dt-20191029Z-e19795",
  "org.gulliblytyped.japgolly" %%% "d3-voronoi" % "1.1-dt-20190212Z-c5ffa9",
  "org.gulliblytyped.japgolly" %%% "d3-zoom" % "1.7-dt-20190212Z-52d91a",
  "org.gulliblytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-f8c1ad",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-6f398d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        