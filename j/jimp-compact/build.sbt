organization := "org.scalablytyped.japgolly"
name := "jimp-compact"
version := "0.16.1-2-f1d984"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "jimp__bmp" % "0.16.2-3834c0",
  "org.scalablytyped.japgolly" %%% "jimp__core" % "0.16.2-580876",
  "org.scalablytyped.japgolly" %%% "jimp__gif" % "0.16.2-4b173d",
  "org.scalablytyped.japgolly" %%% "jimp__jpeg" % "0.16.2-60e5ad",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-blit" % "0.16.2-797332",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-blur" % "0.16.2-4b23d0",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-circle" % "0.16.2-51c4bb",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-color" % "0.16.2-09768f",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-contain" % "0.16.2-84d91e",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-cover" % "0.16.2-1992f2",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-crop" % "0.16.2-2b1495",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-displace" % "0.16.2-632336",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-dither" % "0.16.2-a4177e",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-fisheye" % "0.16.2-5f87bd",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-flip" % "0.16.2-bb536a",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-gaussian" % "0.16.2-93f481",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-invert" % "0.16.2-60d1c8",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-mask" % "0.16.2-c5fd84",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-normalize" % "0.16.2-eb230a",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-print" % "0.16.2-5fa02a",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-resize" % "0.16.2-430645",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-rotate" % "0.16.2-3a7534",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-scale" % "0.16.2-93541c",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-shadow" % "0.16.2-44fac7",
  "org.scalablytyped.japgolly" %%% "jimp__plugin-threshold" % "0.16.2-5f91c0",
  "org.scalablytyped.japgolly" %%% "jimp__plugins" % "0.16.2-045d32",
  "org.scalablytyped.japgolly" %%% "jimp__png" % "0.16.2-9669c1",
  "org.scalablytyped.japgolly" %%% "jimp__tiff" % "0.16.2-e630f0",
  "org.scalablytyped.japgolly" %%% "jimp__types" % "0.16.2-19ff36",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
