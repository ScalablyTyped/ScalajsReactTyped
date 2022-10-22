organization := "org.scalablytyped.japgolly"
name := "koa-passport"
version := "4.0-dt-20211202Z-74ba51"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "accepts" % "1.3-dt-20211202Z-a6fb67",
  "org.scalablytyped.japgolly" %%% "connect" % "v3.4.0-dt-20220818Z-62b6dd",
  "org.scalablytyped.japgolly" %%% "content-disposition" % "0.5-dt-20220505Z-541c90",
  "org.scalablytyped.japgolly" %%% "cookies" % "0.7-dt-20211202Z-b65324",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "keygrip" % "1.0-dt-20211202Z-d34714",
  "org.scalablytyped.japgolly" %%% "koa" % "2.13.1-dt-20220818Z-d5a753",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "passport" % "1.0-dt-20220912Z-e7c2f0",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
