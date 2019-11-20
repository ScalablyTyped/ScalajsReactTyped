organization := "org.gulliblytyped.japgolly"
name := "d3"
version := "5.7-dt-20190819Z-38d08b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-array" % "2.0-dt-20190221Z-d1146f",
  "org.gulliblytyped.japgolly" %%% "d3-axis" % "1.0-dt-20190212Z-119b31",
  "org.gulliblytyped.japgolly" %%% "d3-brush" % "1.0-dt-20190212Z-d44c56",
  "org.gulliblytyped.japgolly" %%% "d3-chord" % "1.0-dt-20190212Z-966927",
  "org.gulliblytyped.japgolly" %%% "d3-collection" % "1.0-dt-20190212Z-9867bb",
  "org.gulliblytyped.japgolly" %%% "d3-color" % "1.2-dt-20190212Z-19b9bf",
  "org.gulliblytyped.japgolly" %%% "d3-contour" % "1.3-dt-20190205Z-894a88",
  "org.gulliblytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20190212Z-295a9a",
  "org.gulliblytyped.japgolly" %%% "d3-drag" % "1.2-dt-20190212Z-edd4a4",
  "org.gulliblytyped.japgolly" %%% "d3-dsv" % "1.0-dt-20190326Z-790504",
  "org.gulliblytyped.japgolly" %%% "d3-ease" % "1.0-dt-20191014Z-a9b75d",
  "org.gulliblytyped.japgolly" %%% "d3-force" % "1.2-dt-20190212Z-d78f55",
  "org.gulliblytyped.japgolly" %%% "d3-format" % "1.3-dt-20190212Z-a9f1f6",
  "org.gulliblytyped.japgolly" %%% "d3-geo" % "1.11-dt-20190212Z-40ca0c",
  "org.gulliblytyped.japgolly" %%% "d3-hierarchy" % "1.1-dt-20190212Z-96af8a",
  "org.gulliblytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20190212Z-ee5b36",
  "org.gulliblytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-3aa22c",
  "org.gulliblytyped.japgolly" %%% "d3-quadtree" % "1.0-dt-20190212Z-b01195",
  "org.gulliblytyped.japgolly" %%% "d3-random" % "1.1-dt-20190212Z-c5b5c4",
  "org.gulliblytyped.japgolly" %%% "d3-scale" % "2.1-dt-20190212Z-af54a5",
  "org.gulliblytyped.japgolly" %%% "d3-selection" % "1.4-dt-20190710Z-55d3a6",
  "org.gulliblytyped.japgolly" %%% "d3-shape" % "1.3-dt-20191014Z-345df8",
  "org.gulliblytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-4da047",
  "org.gulliblytyped.japgolly" %%% "d3-time-format" % "2.1-dt-20190212Z-8c0507",
  "org.gulliblytyped.japgolly" %%% "d3-timer" % "1.0-dt-20190212Z-d84639",
  "org.gulliblytyped.japgolly" %%% "d3-transition" % "1.1-dt-20191029Z-19e634",
  "org.gulliblytyped.japgolly" %%% "d3-voronoi" % "1.1-dt-20190212Z-a440b4",
  "org.gulliblytyped.japgolly" %%% "d3-zoom" % "1.7-dt-20190212Z-8bdc52",
  "org.gulliblytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-9d5d9f",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        