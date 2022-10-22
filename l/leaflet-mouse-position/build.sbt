organization := "org.scalablytyped.japgolly"
name := "leaflet-mouse-position"
version := "1.2-dt-20211202Z-aec289"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "geojson" % "7946.0-dt-20220713Z-3b0707",
  "org.scalablytyped.japgolly" %%% "leaflet" % "1.9-dt-20221015Z-4a6cb7",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
