organization := "org.scalablytyped.japgolly"
name := "iitc"
version := "0.30-dt-20211202Z-6eb0bc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "jquery" % "3.5-dt-20220624Z-e18178",
  "org.scalablytyped.japgolly" %%% "jqueryui" % "1.12-dt-20211202Z-361b20",
  "org.scalablytyped.japgolly" %%% "leaflet" % "1.9-dt-20221015Z-4a6cb7",
  "org.scalablytyped.japgolly" %%% "sizzle" % "2.3-dt-20211202Z-0d86ba",
  "org.scalablytyped.japgolly" %%% "spectrum" % "1.8-dt-20220624Z-995834",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tinycolor2" % "1.4-dt-20211202Z-3b6197")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
