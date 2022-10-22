organization := "org.scalablytyped.japgolly"
name := "fontagon"
version := "1.1-dt-20211202Z-c18988"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "svg2ttf" % "5.0-dt-20211202Z-94c075",
  "org.scalablytyped.japgolly" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-18a9a8",
  "org.scalablytyped.japgolly" %%% "ttf2woff" % "2.0-dt-20211202Z-e1f4f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
