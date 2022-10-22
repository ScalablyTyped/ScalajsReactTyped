organization := "org.scalablytyped.japgolly"
name := "jupyterlab__docprovider"
version := "3.4.8-3bb6e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "jupyterlab__nbformat" % "3.4.8-f54e5c",
  "org.scalablytyped.japgolly" %%% "jupyterlab__shared-models" % "3.4.8-fbc604",
  "org.scalablytyped.japgolly" %%% "lib0" % "0.2.52-8fc191",
  "org.scalablytyped.japgolly" %%% "lumino__algorithm" % "1.9.2-147e30",
  "org.scalablytyped.japgolly" %%% "lumino__coreutils" % "1.12.1-93beef",
  "org.scalablytyped.japgolly" %%% "lumino__disposable" % "1.10.2-d4a6c7",
  "org.scalablytyped.japgolly" %%% "lumino__signaling" % "1.10.2-08c11b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rollup" % "3.2.2-3943b7",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "y-protocols" % "1.0.5-293085",
  "org.scalablytyped.japgolly" %%% "y-websocket" % "1.4.5-db369d",
  "org.scalablytyped.japgolly" %%% "yjs" % "13.5.41-9cc176")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
