organization := "org.gulliblytyped.japgolly"
name := "d3"
version := "5.7-dt-20190819Z-fe002e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-array" % "2.0-dt-20190221Z-f2ca43",
  "org.gulliblytyped.japgolly" %%% "d3-axis" % "1.0-dt-20190212Z-7f6f2f",
  "org.gulliblytyped.japgolly" %%% "d3-brush" % "1.0-dt-20190212Z-e14530",
  "org.gulliblytyped.japgolly" %%% "d3-chord" % "1.0-dt-20190212Z-1bf8ef",
  "org.gulliblytyped.japgolly" %%% "d3-collection" % "1.0-dt-20190212Z-aa51ad",
  "org.gulliblytyped.japgolly" %%% "d3-color" % "1.2-dt-20190212Z-4a1688",
  "org.gulliblytyped.japgolly" %%% "d3-contour" % "1.3-dt-20190205Z-a500a6",
  "org.gulliblytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20190212Z-2af9b1",
  "org.gulliblytyped.japgolly" %%% "d3-drag" % "1.2-dt-20190212Z-316cbb",
  "org.gulliblytyped.japgolly" %%% "d3-dsv" % "1.0-dt-20190326Z-00701d",
  "org.gulliblytyped.japgolly" %%% "d3-ease" % "1.0-dt-20191014Z-fa5a92",
  "org.gulliblytyped.japgolly" %%% "d3-force" % "1.2-dt-20190212Z-293c6f",
  "org.gulliblytyped.japgolly" %%% "d3-format" % "1.3-dt-20190212Z-f85dd9",
  "org.gulliblytyped.japgolly" %%% "d3-geo" % "1.11-dt-20190212Z-e3d75c",
  "org.gulliblytyped.japgolly" %%% "d3-hierarchy" % "1.1-dt-20190212Z-81495e",
  "org.gulliblytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20190212Z-696d62",
  "org.gulliblytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-0d2123",
  "org.gulliblytyped.japgolly" %%% "d3-quadtree" % "1.0-dt-20190212Z-d7f6a2",
  "org.gulliblytyped.japgolly" %%% "d3-random" % "1.1-dt-20190212Z-7e6668",
  "org.gulliblytyped.japgolly" %%% "d3-scale" % "2.1-dt-20190212Z-ecb048",
  "org.gulliblytyped.japgolly" %%% "d3-selection" % "1.4-dt-20190710Z-274fb1",
  "org.gulliblytyped.japgolly" %%% "d3-shape" % "1.3-dt-20191014Z-10e246",
  "org.gulliblytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-d63bd5",
  "org.gulliblytyped.japgolly" %%% "d3-time-format" % "2.1-dt-20190212Z-5f7edb",
  "org.gulliblytyped.japgolly" %%% "d3-timer" % "1.0-dt-20190212Z-7ec633",
  "org.gulliblytyped.japgolly" %%% "d3-transition" % "1.1-dt-20191029Z-f14b11",
  "org.gulliblytyped.japgolly" %%% "d3-voronoi" % "1.1-dt-20190212Z-2e112b",
  "org.gulliblytyped.japgolly" %%% "d3-zoom" % "1.7-dt-20190212Z-ef01d1",
  "org.gulliblytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-87e0cf",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        