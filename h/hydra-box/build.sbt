organization := "org.scalablytyped.japgolly"
name := "hydra-box"
version := "0.6-dt-20211202Z-7cb6c9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "clownface" % "1.5-dt-20220824Z-836b61",
  "org.scalablytyped.japgolly" %%% "express" % "4.17-dt-20220913Z-2651ea",
  "org.scalablytyped.japgolly" %%% "express-serve-static-core" % "0.1.1-5aecff",
  "org.scalablytyped.japgolly" %%% "mime" % "3.0-dt-20220804Z-38356b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "qs" % "6.9-dt-20220913Z-9097c1",
  "org.scalablytyped.japgolly" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-7d75cc",
  "org.scalablytyped.japgolly" %%% "rdf-ext" % "1.3-dt-20211202Z-f17624",
  "org.scalablytyped.japgolly" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-ab05b1",
  "org.scalablytyped.japgolly" %%% "rdfjs__types" % "1.1.0-052aed",
  "org.scalablytyped.japgolly" %%% "serve-static" % "1.15-dt-20220729Z-4a727e",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
