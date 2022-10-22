organization := "org.scalablytyped.japgolly"
name := "jimp__types"
version := "0.16.2-19ff36"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "jimp__bmp" % "0.16.2-3834c0",
  "org.scalablytyped.japgolly" %%% "jimp__core" % "0.16.2-580876",
  "org.scalablytyped.japgolly" %%% "jimp__gif" % "0.16.2-4b173d",
  "org.scalablytyped.japgolly" %%% "jimp__jpeg" % "0.16.2-60e5ad",
  "org.scalablytyped.japgolly" %%% "jimp__png" % "0.16.2-9669c1",
  "org.scalablytyped.japgolly" %%% "jimp__tiff" % "0.16.2-e630f0",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
