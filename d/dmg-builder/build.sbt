organization := "org.scalablytyped.japgolly"
name := "dmg-builder"
version := "23.6.0-d70c20"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "app-builder-lib" % "23.6.0-f41caa",
  "org.scalablytyped.japgolly" %%% "builder-util" % "23.6.0-eb49a3",
  "org.scalablytyped.japgolly" %%% "builder-util-runtime" % "9.1.1-6bf12c",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20211202Z-7cd5bd",
  "org.scalablytyped.japgolly" %%% "electron-osx-sign" % "0.6.0-4fc602",
  "org.scalablytyped.japgolly" %%% "electron-publish" % "23.6.0-634a0e",
  "org.scalablytyped.japgolly" %%% "fs-extra" % "9.0-dt-20211202Z-2d542e",
  "org.scalablytyped.japgolly" %%% "lazy-val" % "1.0.5-12b3a4",
  "org.scalablytyped.japgolly" %%% "ms" % "v0.7.1-dt-20220818Z-ed60be",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "temp-file" % "3.4.0-4c1004")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
