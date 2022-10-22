organization := "org.scalablytyped.japgolly"
name := "minify"
version := "9.1-dt-20220630Z-999483"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "clean-css" % "4.2-dt-20220921Z-aa340c",
  "org.scalablytyped.japgolly" %%% "html-minifier-terser" % "7.0-dt-20220815Z-e2b628",
  "org.scalablytyped.japgolly" %%% "jridgewell__gen-mapping" % "0.3.2-4a2bd9",
  "org.scalablytyped.japgolly" %%% "jridgewell__trace-mapping" % "0.3.17-fe006d",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "terser" % "5.15.1-10357a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
