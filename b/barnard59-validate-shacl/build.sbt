organization := "org.scalablytyped.japgolly"
name := "barnard59-validate-shacl"
version := "0.3-dt-20220117Z-e36939"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "barnard59-core" % "1.0-dt-20220624Z-6ebb95",
  "org.scalablytyped.japgolly" %%% "clownface" % "1.5-dt-20220824Z-836b61",
  "org.scalablytyped.japgolly" %%% "logform" % "2.4.2-fd6c39",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-ab05b1",
  "org.scalablytyped.japgolly" %%% "rdf-validate-shacl" % "0.4-dt-20211202Z-48fd33",
  "org.scalablytyped.japgolly" %%% "rdfjs__types" % "1.1.0-052aed",
  "org.scalablytyped.japgolly" %%% "readable-stream" % "2.3-dt-20220717Z-f085f8",
  "org.scalablytyped.japgolly" %%% "safe-buffer" % "5.2.1-09a0c8",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "winston" % "3.8.2-232acd",
  "org.scalablytyped.japgolly" %%% "winston-transport" % "4.5.0-92bc1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
