organization := "org.scalablytyped.japgolly"
name := "maplibre-gl"
version := "2.4.0-8de381"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "gl-matrix" % "3.4.3-a577e0",
  "org.scalablytyped.japgolly" %%% "mapbox__mapbox-gl-supported" % "2.0.1-a08d52",
  "org.scalablytyped.japgolly" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-a4beee",
  "org.scalablytyped.japgolly" %%% "mapbox__tiny-sdf" % "2.0.5-b1f94b",
  "org.scalablytyped.japgolly" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-3acb88",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pbf" % "3.0-dt-20211202Z-d3fe53",
  "org.scalablytyped.japgolly" %%% "potpack" % "1.0.2-6380ab",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
