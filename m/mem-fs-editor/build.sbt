organization := "org.scalablytyped.japgolly"
name := "mem-fs-editor"
version := "7.0-dt-20220624Z-4d8423"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ejs" % "3.1-dt-20220624Z-8fe90b",
  "org.scalablytyped.japgolly" %%% "glob" % "8.0-dt-20220830Z-dae710",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "mem-fs" % "1.1-dt-20211202Z-805fc4",
  "org.scalablytyped.japgolly" %%% "minimatch" % "5.1-dt-20220831Z-eb11ff",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "vinyl" % "2.0-dt-20220819Z-735b85")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
