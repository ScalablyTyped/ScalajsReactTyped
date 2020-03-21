organization := "org.scalablytyped.japgolly"
name := "d3"
version := "5.7-dt-20200225Z-0566ef"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "d3-array" % "2.0-dt-20200225Z-8bb7a9",
  "org.scalablytyped.japgolly" %%% "d3-axis" % "1.0-dt-20200225Z-189227",
  "org.scalablytyped.japgolly" %%% "d3-brush" % "1.1-dt-20200302Z-b834ba",
  "org.scalablytyped.japgolly" %%% "d3-chord" % "1.0-dt-20200225Z-a705b1",
  "org.scalablytyped.japgolly" %%% "d3-collection" % "1.0-dt-20200225Z-5d2d4a",
  "org.scalablytyped.japgolly" %%% "d3-color" % "1.2-dt-20200225Z-b691c4",
  "org.scalablytyped.japgolly" %%% "d3-contour" % "1.3-dt-20200225Z-c0fd74",
  "org.scalablytyped.japgolly" %%% "d3-dispatch" % "1.0-dt-20200225Z-a70e24",
  "org.scalablytyped.japgolly" %%% "d3-drag" % "1.2-dt-20200225Z-925345",
  "org.scalablytyped.japgolly" %%% "d3-dsv" % "1.0-dt-20200225Z-3a5285",
  "org.scalablytyped.japgolly" %%% "d3-ease" % "1.0-dt-20191014Z-f3f2e0",
  "org.scalablytyped.japgolly" %%% "d3-fetch" % "1.1-dt-20200225Z-5305ae",
  "org.scalablytyped.japgolly" %%% "d3-force" % "1.2-dt-20200225Z-dc11ef",
  "org.scalablytyped.japgolly" %%% "d3-format" % "1.3-dt-20190212Z-20c33c",
  "org.scalablytyped.japgolly" %%% "d3-geo" % "1.11-dt-20200225Z-3368da",
  "org.scalablytyped.japgolly" %%% "d3-hierarchy" % "1.1-dt-20200225Z-fdc5f1",
  "org.scalablytyped.japgolly" %%% "d3-interpolate" % "1.3-dt-20200225Z-791b48",
  "org.scalablytyped.japgolly" %%% "d3-path" % "1.0-dt-20190212Z-092880",
  "org.scalablytyped.japgolly" %%% "d3-quadtree" % "1.0-dt-20200225Z-54bf4e",
  "org.scalablytyped.japgolly" %%% "d3-random" % "1.1-dt-20190212Z-b2b05f",
  "org.scalablytyped.japgolly" %%% "d3-scale" % "2.1-dt-20200225Z-6e0234",
  "org.scalablytyped.japgolly" %%% "d3-selection" % "1.4-dt-20200225Z-910fbf",
  "org.scalablytyped.japgolly" %%% "d3-shape" % "1.3-dt-20200225Z-c38cef",
  "org.scalablytyped.japgolly" %%% "d3-time" % "1.0-dt-20190212Z-624fa0",
  "org.scalablytyped.japgolly" %%% "d3-time-format" % "2.1-dt-20190212Z-13306f",
  "org.scalablytyped.japgolly" %%% "d3-timer" % "1.0-dt-20190212Z-4e8f52",
  "org.scalablytyped.japgolly" %%% "d3-transition" % "1.1-dt-20200225Z-866f7e",
  "org.scalablytyped.japgolly" %%% "d3-voronoi" % "1.1-dt-20200225Z-74ae3e",
  "org.scalablytyped.japgolly" %%% "d3-zoom" % "1.7-dt-20200225Z-c0eb9a",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20190925Z-98b022",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
