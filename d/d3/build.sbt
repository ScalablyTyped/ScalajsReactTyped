organization := "org.scalablytyped.japgolly"
name := "d3"
version := "7.4-dt-20220913Z-ae8e06"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "d3-array" % "3.0-dt-20220624Z-12a885",
  "org.scalablytyped.japgolly" %%% "d3-axis" % "3.0-dt-20220624Z-2014b9",
  "org.scalablytyped.japgolly" %%% "d3-brush" % "3.0-dt-20211202Z-ccc11c",
  "org.scalablytyped.japgolly" %%% "d3-chord" % "3.0-dt-20211202Z-36d433",
  "org.scalablytyped.japgolly" %%% "d3-color" % "3.1-dt-20220522Z-ee6702",
  "org.scalablytyped.japgolly" %%% "d3-contour" % "3.0-dt-20211202Z-e670a9",
  "org.scalablytyped.japgolly" %%% "d3-delaunay" % "6.0-dt-20220524Z-6379c0",
  "org.scalablytyped.japgolly" %%% "d3-dispatch" % "3.0-dt-20220624Z-7c5fac",
  "org.scalablytyped.japgolly" %%% "d3-drag" % "3.0-dt-20211202Z-3429d0",
  "org.scalablytyped.japgolly" %%% "d3-dsv" % "3.0-dt-20220819Z-3cd57a",
  "org.scalablytyped.japgolly" %%% "d3-ease" % "3.0-dt-20211223Z-e9a5b1",
  "org.scalablytyped.japgolly" %%% "d3-fetch" % "3.0-dt-20220624Z-68f99d",
  "org.scalablytyped.japgolly" %%% "d3-force" % "3.0-dt-20211202Z-ce9fe4",
  "org.scalablytyped.japgolly" %%% "d3-format" % "3.0-dt-20211202Z-71de0c",
  "org.scalablytyped.japgolly" %%% "d3-geo" % "3.0-dt-20211202Z-1d6d17",
  "org.scalablytyped.japgolly" %%% "d3-hierarchy" % "3.1-dt-20220624Z-e08ae1",
  "org.scalablytyped.japgolly" %%% "d3-interpolate" % "3.0-dt-20220624Z-f5cf27",
  "org.scalablytyped.japgolly" %%% "d3-path" % "3.0-dt-20220310Z-c74868",
  "org.scalablytyped.japgolly" %%% "d3-quadtree" % "3.0-dt-20220624Z-92c6ac",
  "org.scalablytyped.japgolly" %%% "d3-random" % "3.0-dt-20211202Z-bca539",
  "org.scalablytyped.japgolly" %%% "d3-scale" % "4.0-dt-20220624Z-718053",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "3.0-dt-20220720Z-ea39dc",
  "org.scalablytyped.japgolly" %%% "d3-shape" % "3.1-dt-20220624Z-7b0e71",
  "org.scalablytyped.japgolly" %%% "d3-time" % "3.0-dt-20211202Z-0604bb",
  "org.scalablytyped.japgolly" %%% "d3-time-format" % "4.0-dt-20211202Z-e8fca2",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "3.0-dt-20211202Z-2ee647",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "3.0-dt-20220817Z-4b8cb3",
  "org.scalablytyped.japgolly" %%% "d3-zoom" % "3.0-dt-20220624Z-463097",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
