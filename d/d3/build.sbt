organization := "org.gulliblytyped.japgolly"
name := "d3"
version := "5.7-dt-20190819Z-00cc5d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "d3-array" % "2.0-dt-20190221Z-eafc81",
  "org.gulliblytyped.japgolly" %%% "d3-axis" % "1.0-dt-20190212Z-9aec85",
  "org.gulliblytyped.japgolly" %%% "d3-brush" % "1.0-dt-20190212Z-8fc01a",
  "org.gulliblytyped.japgolly" %%% "d3-chord" % "1.0-dt-20190212Z-ab2d33",
  "org.gulliblytyped.japgolly" %%% "d3-collection" % "1.0-dt-20190212Z-27ccb7",
  "org.gulliblytyped.japgolly" %%% "d3-color" % "1.2-dt-20190212Z-cea481",
  "org.gulliblytyped.japgolly" %%% "d3-contour" % "1.3-dt-20190205Z-36dfae",
  "org.gulliblytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20190212Z-5dc9fd",
  "org.gulliblytyped.japgolly" %%% "d3-drag" % "1.2-dt-20190212Z-ef1dd9",
  "org.gulliblytyped.japgolly" %%% "d3-dsv" % "1.0-dt-20190326Z-a24e64",
  "org.gulliblytyped.japgolly" %%% "d3-ease" % "1.0-dt-20191014Z-a9b75d",
  "org.gulliblytyped.japgolly" %%% "d3-force" % "1.2-dt-20190212Z-aaba4c",
  "org.gulliblytyped.japgolly" %%% "d3-format" % "1.3-dt-20190212Z-e7e5b8",
  "org.gulliblytyped.japgolly" %%% "d3-geo" % "1.11-dt-20190212Z-b530ad",
  "org.gulliblytyped.japgolly" %%% "d3-hierarchy" % "1.1-dt-20190212Z-67b116",
  "org.gulliblytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20190212Z-8b3a22",
  "org.gulliblytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-3aa22c",
  "org.gulliblytyped.japgolly" %%% "d3-quadtree" % "1.0-dt-20190212Z-02133a",
  "org.gulliblytyped.japgolly" %%% "d3-random" % "1.1-dt-20190212Z-c5b5c4",
  "org.gulliblytyped.japgolly" %%% "d3-scale" % "2.1-dt-20190212Z-37c426",
  "org.gulliblytyped.japgolly" %%% "d3-selection" % "1.4-dt-20190710Z-069fdc",
  "org.gulliblytyped.japgolly" %%% "d3-shape" % "1.3-dt-20191014Z-753258",
  "org.gulliblytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-89661b",
  "org.gulliblytyped.japgolly" %%% "d3-time-format" % "2.1-dt-20190212Z-d660b3",
  "org.gulliblytyped.japgolly" %%% "d3-timer" % "1.0-dt-20190212Z-d84639",
  "org.gulliblytyped.japgolly" %%% "d3-transition" % "1.1-dt-20191029Z-4c0d02",
  "org.gulliblytyped.japgolly" %%% "d3-voronoi" % "1.1-dt-20190212Z-a60446",
  "org.gulliblytyped.japgolly" %%% "d3-zoom" % "1.7-dt-20190212Z-55acf5",
  "org.gulliblytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-9aa3c6",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-b7faa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        