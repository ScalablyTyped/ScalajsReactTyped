organization := "org.scalablytyped.japgolly"
name := "hexo-fs"
version := "0.2-dt-20211202Z-fe55e0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "anymatch" % "3.1.2-1a8878",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20220923Z-dde6a1",
  "org.scalablytyped.japgolly" %%% "chokidar" % "3.5.3-996cd7",
  "org.scalablytyped.japgolly" %%% "graceful-fs" % "4.1-dt-20211202Z-fa8869",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
