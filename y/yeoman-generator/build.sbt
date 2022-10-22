organization := "org.scalablytyped.japgolly"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-a36ad6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20211202Z-7cd5bd",
  "org.scalablytyped.japgolly" %%% "ejs" % "3.1-dt-20220624Z-8fe90b",
  "org.scalablytyped.japgolly" %%% "glob" % "8.0-dt-20220830Z-dae710",
  "org.scalablytyped.japgolly" %%% "inquirer" % "9.0-dt-20220928Z-55772e",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20220325Z-c3cb4f",
  "org.scalablytyped.japgolly" %%% "mem-fs" % "1.1-dt-20211202Z-805fc4",
  "org.scalablytyped.japgolly" %%% "mem-fs-editor" % "7.0-dt-20220624Z-4d8423",
  "org.scalablytyped.japgolly" %%% "minimatch" % "5.1-dt-20220831Z-eb11ff",
  "org.scalablytyped.japgolly" %%% "ms" % "v0.7.1-dt-20220818Z-ed60be",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rxjs" % "7.5.7-c83f26",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "through" % "0.0-unknown-dt-20220818Z-00ddf3",
  "org.scalablytyped.japgolly" %%% "vinyl" % "2.0-dt-20220819Z-735b85")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
